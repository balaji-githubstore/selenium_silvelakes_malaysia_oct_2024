package com.silverlakes.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3Actions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://online-video-cutter.com/");
		
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Converters']"))).perform();
		
		driver.findElement(By.xpath("//a[normalize-space()='Audio Converter']")).click();

	}

}
