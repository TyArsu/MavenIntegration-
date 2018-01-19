package com.codistan.qaclass1.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenTest3 {
@Test
	public void Test1() {
		System.setProperty("webdriver.chrome.driver", "/Users/kasia/Documents/Libraries/drivers/chromedriver3");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Fidget"+Keys.ENTER);
		driver.quit();
		
	}
}
