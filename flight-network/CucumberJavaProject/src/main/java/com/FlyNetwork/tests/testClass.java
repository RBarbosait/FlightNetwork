package com.FlyNetwork.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.FlyNetwork.pages.HomePage;
import com.FlyNetwork.pages.SearchPage;

public class testClass {
	public WebDriver driver;
	  public testClass(){
		  driver= new ChromeDriver();
		  String chromeDriverPath="C:\\Users\\59895\\OneDrive\\Desktop\\chromedriver.exe"; 
		  System.setProperty("webdriver.chrome.driver",chromeDriverPath);
	  }
	  public WebDriver getdriver(){
	    if (driver == null){
	      driver = new ChromeDriver();
	      return driver;
	    }else{
	      return driver;
	    }
	  }
	
	  
	  
}
