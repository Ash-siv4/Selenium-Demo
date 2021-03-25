//package com.qa.task1;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//public class DemoSite {
//
//	private RemoteWebDriver driver;
//
//	@BeforeEach
//	void setup() {
//		this.driver = new ChromeDriver();
//		this.driver.manage().window().maximize();
//	}
//
//	@Test
//	void testDsite() {
//		this.driver.get("http://thedemosite.co.uk/");
//
////		WebElement addUser = this.driver.findElement(By.linkText("3. Add a User"));
////		addUser.click();
////		
////		WebElement username = this.driver.findElement(By.name("username"));
////		username.sendKeys("Meliodas");
////		WebElement password = this.driver.findElement(By.name("password"));
////		password.sendKeys("Eeyore");
////
////		WebElement save = this.driver.findElement(By.name("FormsButton2"));
////		save.click();
////
////		WebElement login = this.driver.findElement(By.linkText("4. Login"));
////		login.click();
////		
////		WebElement user = this.driver.findElement(By.name("username"));
////		user.sendKeys("Meliodas");
////		WebElement pass = this.driver.findElement(By.name("password"));
////		pass.sendKeys("Eeyore");
////
////		WebElement test = this.driver.findElement(By.name("FormsButton2"));
////		test.click();
//		
//		this.driver.findElement(By.linkText("3. Add a User")).click();
//
//		this.driver.findElement(By.name("username")).sendKeys("Meliodas");
//
//		this.driver.findElement(By.name("password")).sendKeys("Eeyore");
//
//		this.driver.findElement(By.name("FormsButton2")).click();
//
//		this.driver.findElement(By.linkText("4. Login")).click();
//
//		this.driver.findElement(By.name("username")).sendKeys("Meliodas");
//
//		this.driver.findElement(By.name("password")).sendKeys("Eeyore");
//
//		this.driver.findElement(By.name("FormsButton2")).click();
//
//		WebElement status = this.driver
//				.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
//
//		Assertions.assertTrue(status.getText().contains("Successful Login"));
//	}
//
//	@AfterEach
//	void tearDown() {
//		this.driver.close();
//	}
//
//}
