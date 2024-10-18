package com.silverlakes.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo2FBLogin {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		
//		By locator= By.id("email");
//		WebElement element= driver.findElement(locator);
//		element.sendKeys("hejej2233444@gmail.com");
		
		WebElement element= driver.findElement(By.id("email"));
		element.sendKeys("hejej2233444@gmail.com");
			
		//driver.findElement(By.id("email")).sendKeys("hello123434343@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("welcom123");
		
		//click on login
		driver.findElement(By.name("login")).click();
		
	}
}
