package com.silverlakes.alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2Nascomm {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.nasscom.in/nasscom-membership");
		
		Actions actions=new Actions(driver);
		actions.scrollToElement(driver.findElement(By.id("calculate-fee"))).perform();
		
		//click on go
		driver.findElement(By.id("calculate-fee")).click();
		
		String actualAlertText= driver.switchTo().alert().getText();
		System.out.println(actualAlertText);
		
		driver.switchTo().alert().accept();
		
	
	}

}
