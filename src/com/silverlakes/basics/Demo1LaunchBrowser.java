package com.silverlakes.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriver obj=new ChromeDriver();
		obj.get("https://www.facebook.com/");
		
		//get the title and print it
		String actualTitle=obj.getTitle();
		System.out.println(actualTitle);
		
		System.out.println(obj.getTitle());
		
		//get the current url and print it 
		System.out.println(obj.getCurrentUrl());
		
		//get the page source and print it 
		System.out.println(obj.getPageSource());
		
		//Call quit() method to close the browser

		obj.quit();
	}

}
