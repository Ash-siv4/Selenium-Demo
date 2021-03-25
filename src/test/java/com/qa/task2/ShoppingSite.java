package com.qa.task2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ShoppingSite {

	private RemoteWebDriver driver;

	@BeforeEach
	void setup() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}

	@Test
	void testSite() {
		this.driver.get("http://automationpractice.com/index.php"); // go to the site
		WebElement search = this.driver.findElement(By.id("search_query_top"));// locate the searchBar
		search.sendKeys("Dress"); // enter in "Dress" in the searchBar
		search.sendKeys(Keys.ENTER); // press enter to search

		WebElement found = this.driver.findElementByXPath("//*[@id=\"center_column\"]/h1/span[2]");

		Assertions.assertTrue(found.getText().contains("found"));
		Assertions.assertFalse(found.getText().contains("0 results have been found"));

	}

	@AfterEach
	void tearDown() {
		this.driver.close();
	}
}
