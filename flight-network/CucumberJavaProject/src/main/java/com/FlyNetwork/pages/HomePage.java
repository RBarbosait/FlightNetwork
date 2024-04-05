package com.FlyNetwork.pages;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {
	public WebDriver driver;
	//*[@id="searchForm-singleBound-origin-input"]
	By fromInput= By.xpath("//*[@id=\"searchForm-singleBound-origin-input\"]");
	By toInput2=By.xpath("//*[@id=\"searchForm-singleBound-destination-input\"]");
	By searchButton=By.xpath("//*[@id=\"main\"]/section/div[1]/div[2]/div/div/div/form/div[2]/button");
	
	public HomePage(final WebDriver webDriver) {
		this.driver=webDriver;
	}
	
	public void navigateHomeURL() {
		driver.get("https://www.flightnetwork.com/");	
	}
	
	
	@SuppressWarnings("deprecation")
	public void inputFrom(){
		// Wait for the element to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(fromInput));
		driver.findElement(fromInput).sendKeys("Athens");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.findElement(fromInput).sendKeys(Keys.ARROW_DOWN);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.findElement(fromInput).sendKeys(Keys.TAB);
		
	}
	@SuppressWarnings("deprecation")
	public void inputTo(){
		// Wait for the element to be visible
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(toInput2));
		//driver.findElement(toInput2).sendKeys("Montevideo");
		//driver.findElement(toInput2).sendKeys(Keys.ENTER);
		
	}
	
	public void clickSearch(){
		// Wait for the element to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchButton));
		driver.findElement(searchButton).click();
	}
	
	/*public void loadSearchPostURL() {
		driver.get("https://www.flightnetwork.com/rf/destination?from=ATH&to=MVD&text=9&utm_source=blue&utm_medium=cpc&utm_campaign=CA_flightnetwork.com_tgrp23&domain=blue&campaign=remarketing-blue_CA_tgrp23");	

	}*/
	
}
