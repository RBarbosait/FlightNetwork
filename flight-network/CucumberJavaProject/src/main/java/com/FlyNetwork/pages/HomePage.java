package com.FlyNetwork.pages;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {
	WebDriver driver;
	
	By fromInput= By.xpath("//*[@id=\"main\"]/section/div[1]/div[2]/div/div/div/form/div[1]/div[1]/div/div[1]/div/div/div");
	By fromInput2=By.xpath("//*[@id=\"main\"]/section/div[1]/div[2]/div/div/div/form/div[1]/div[1]/div/div[1]/div/div/div/div[1]/div[2]");
	//By toInput=
	By searchButton=By.xpath("//*[@id=\"main\"]/section/div[1]/div[2]/div/div/div/form/div[2]/button");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void navigateHomeURL() {
		
		driver.get("https://www.flightnetwork.com/");	
	}
	
	public void inputFrom(){
		// Wait for the element to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(fromInput));
		
		driver.findElement(fromInput2).sendKeys("Athens");
		driver.findElement(fromInput2).sendKeys("Montevideo");
		
		//driver.findElement(fromInput).click();
	}
}
