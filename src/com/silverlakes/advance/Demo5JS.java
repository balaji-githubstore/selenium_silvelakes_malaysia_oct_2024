package com.silverlakes.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo5JS {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.malaysiaairlines.com/us/en/home.html");
		
		driver.findElement(By.xpath("//span[text()='Accept all cookies']")).click();

		driver.findElement(By.xpath("//div[@id='book-flight']//input[@aria-label='From']")).sendKeys("chennai");
		driver.findElement(By.xpath("//div[@id='book-flight']//div[text()='MAA']")).click();


		Actions actions = new Actions(driver);
		//actions.Pause(TimeSpan.FromMilliseconds(700)).SendKeys(Keys.Enter).Perform();

		    
		//kuala lumpur
		//approach 3 - use javascript
		driver.findElement(By.xpath("//div[@id='book-flight']//input[@aria-label='To']")).sendKeys("kuala lumpur");
		actions.pause(700).sendKeys(Keys.ENTER).perform();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"input[name='dateDeparture']\").value='29 Oct 2024'");
		js.executeScript("document.querySelector(\"input[name='dateReturn']\").value='29 Nov 2024'");
		
		//approach 4 - use javascript and webelement
		WebElement ele1= driver.findElement(By.xpath("//div[@id='book-flight']//input[@name='dateDeparture']"));
		js.executeScript("arguments[0].value='30 Oct 2024'",ele1);

		WebElement ele2 = driver.findElement(By.xpath("//div[@id='book-flight']//input[@name='dateReturn']"));
		js.executeScript("arguments[0].value='30 Nov 2024'", ele2);
	}

}
