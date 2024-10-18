package com.silverlakes.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBSignUp {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		
		//checks present of locator in 0.5s
		driver.findElement(By.xpath("(//span[text()='Allow all cookies'])[2]")).click();
		
		//click on create new account
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.xpath("(//span[text()='Allow all cookies'])[2]")).click();
		
		//enter firstname as john
		driver.findElement(By.name("firstname")).sendKeys("john");
		
		//lastname as wick
		driver.findElement(By.name("lastname")).sendKeys("wick");
		
		//click on custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//20 June 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Jun");
		
		//selectMonth.selectByValue("6");
		//selectMonth.selectByIndex(5);
		
		//Select the year as 2000
		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("2000");
		
		//click on sign up
		driver.findElement(By.name("websubmit")).click();
	}
}
