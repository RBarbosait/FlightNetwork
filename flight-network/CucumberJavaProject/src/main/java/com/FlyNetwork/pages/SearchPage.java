package com.FlyNetwork.pages;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	public WebDriver driver;
	By resultSpan= By.xpath("//*[@id=\"main\"]/div[1]/div[1]/header/div[1]/span[2]");
	By searchButton=By.xpath("//*[@id=\"main\"]/section/div[1]/div[2]/div/div/div/form/div[2]/button");
	
	public SearchPage(final WebDriver webDriver) {
		this.driver=webDriver;
	}
	
	public void navigateSearchURL() {
		//couldnt interact with inputs - navigate POST
		driver.get("https://www.flightnetwork.com/rf/destination?from=ATH&to=MVD&text=9&utm_source=blue&utm_medium=cpc&utm_campaign=CA_flightnetwork.com_tgrp23&domain=blue&campaign=remarketing-blue_CA_tgrp23");	
	}
	
	public void clickSearch(){
		// Wait for the element to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchButton));
		driver.findElement(searchButton).click();
	}
	
	public void getResultFlights() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(resultSpan));
		String flightResult=driver.findElement(resultSpan).getText();
		System.out.println("Total Count :  "+flightResult);
	}
	
}
