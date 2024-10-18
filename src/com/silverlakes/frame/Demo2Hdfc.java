package com.silverlakes.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//switch using index
public class Demo2Hdfc {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking");
		
		driver.switchTo().frame(0);
		
		//enter userid as john123
		driver.findElement(By.name("fldLoginUserId")).sendKeys("john123");
		
		//click on continue
		//partialLinkText or linktext is case senstive based on UI 
		driver.findElement(By.partialLinkText("CONTINUE")).click();
		
		
		//switch to main html
		driver.switchTo().defaultContent();

	}

}
