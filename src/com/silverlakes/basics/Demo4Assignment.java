package com.silverlakes.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4Assignment {
	public static void main(String[] args) {
		
		
		WebDriver driver03 = new ChromeDriver();
		driver03.manage().window().maximize();
		driver03.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver03.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
	//	driver03.manage().window().maximize();
	//	driver03.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	//	if (driver03.findElement(By.id("accept-recommended-btn-handler")).getSize()>0) {
			driver03.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
			
		//}
			
			
			driver03.findElement(By.name("UserFirstName")).sendKeys("John");
			driver03.findElement(By.name("UserLastName")).sendKeys("Wick");
			driver03.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
			
			Select selectJobTitle = new Select(driver03.findElement(By.name("UserTitle")));
			selectJobTitle.selectByValue("IT_Manager_AP");
			
			
			
			
			Select selectCountry = new Select(driver03.findElement(By.name("CompanyCountry")));
			selectCountry.selectByVisibleText("United Kingdom");
			
			Select selectEmployees = new Select(driver03.findElement(By.name("CompanyEmployees")));
			selectEmployees.selectByVisibleText("101 - 200 employees");
			
			driver03.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
			
			driver03.findElement(By.name("start my free trial")).click();
			
			
			String actualError=driver03.findElement(By.xpath("//span[contains(text(),'valid phone')]")).getText();
			System.out.println(actualError);
		
			String actualText=driver03.findElement(By.xpath("//span[contains(text(),'no software')]")).getText();
			System.out.println(actualText);
	}

}
