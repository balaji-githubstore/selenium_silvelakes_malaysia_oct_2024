package com.silverlakes.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Upload {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://smallpdf.com/pdf-to-word");
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Mine\\profile.pdf");
		
	}
}
