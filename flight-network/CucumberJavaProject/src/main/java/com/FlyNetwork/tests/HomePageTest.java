package com.FlyNetwork.tests;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.FlyNetwork.pages.HomePage;

public class HomePageTest {
	WebDriver driver= new ChromeDriver();
	HomePage homePage=new HomePage(driver);
	
	public void navigateHome() {
		String chromeDriverPath="C:\\Users\\59895\\OneDrive\\Desktop\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		
		
		//go to URL
		homePage.navigateHomeURL();	
	}
	
	public void searchAction() {
		//input from 
		homePage.inputFrom();
		//homePage.inputTo();
		//homePage.clickSearch();
	}

}
