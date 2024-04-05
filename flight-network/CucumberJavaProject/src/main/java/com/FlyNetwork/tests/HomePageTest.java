package com.FlyNetwork.tests;

import com.FlyNetwork.pages.HomePage;

public class HomePageTest extends testClass {
	  HomePage homePage=new HomePage(getdriver());
	
	public void navigateHome() {
		
		
		
		//go to URL
		homePage.navigateHomeURL();	
	}
	
	public void searchAction() {
		//input from & TO
		homePage.inputFrom();
		homePage.inputTo();
		//homePage.clickSearch();
		//click search
		
	}
	public void clickSearch() {
		homePage.clickSearch();
	}
	/*public void navigateSearchResult(){
		homePage.clickSearch();
	}*/
}
