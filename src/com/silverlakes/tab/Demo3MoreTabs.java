package com.silverlakes.tab;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3MoreTabs {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.db4free.net/");
		
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();

		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());

		System.out.println(windows);
		
		for(String window : windows)
		{
			System.out.println(window);
			driver.switchTo().window(window);
			//System.out.println(driver.getTitle());
			//System.out.println("--------------------------");
			if(driver.getTitle().equals("phpMyAdmin"))
			{
				break; //terminate the loop
			}
		}
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("input_username")).sendKeys("admiin");

	}
}
