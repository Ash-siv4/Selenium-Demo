package com.qa.demo;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyDemo {

	private RemoteWebDriver driver;

	@Before
	public void setup() {
//		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");//do this if the chromedriver.exe is in the resources folder

		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		
//		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//Implicit wait
	}

	@Test
	public void test() {
		this.driver.get("https://www.google.com/");
		WebElement agreeButton = this.driver.findElement(By.id("zV9nZe"));
		agreeButton.click();
		WebElement searchBar = this.driver.findElement(By.name("q"));
		searchBar.sendKeys("disney");
		searchBar.submit(); // or: searchBar.sendKeys(Keys.ENTER);
		WebElement text = this.driver
				.findElement(By.cssSelector("#kp-wp-tab-overview > div.TzHB6b.cLjAic.LMRCfc > div > div > div"));
		assertTrue(text.getText().contains("16 October 1923"));
	}
	
	@After
	public void close() {
		this.driver.close();
	}

}
