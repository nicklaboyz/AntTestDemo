package com.zdz.ant.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Nick
 *
 */
public class HelloWorldWebdriver {
	public static final String SELENIUMCN_LINK = ".//*[@id='1']/h3/a";
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		driver.manage().window().maximize();
		WebElement query = driver.findElement(By.name("wd"));
		query.sendKeys("selenium 中文论坛");
		WebElement btn = driver.findElement(By.id("su"));
		btn.click();
		Thread.sleep(3000);
		
		WebElement link = driver.findElement(By.xpath(SELENIUMCN_LINK));
		link.click();
		Thread.sleep(3000);
		driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
	}
}
