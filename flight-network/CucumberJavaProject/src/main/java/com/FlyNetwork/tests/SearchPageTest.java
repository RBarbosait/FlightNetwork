package com.FlyNetwork.tests;

import com.FlyNetwork.pages.SearchPage;

public class SearchPageTest extends testClass {
	SearchPage searchPage=new SearchPage(getdriver());
	
	
	public void navigateSearchResult() {
		
		searchPage.navigateSearchURL();
	}
	
	public void clickSearch() {
		searchPage.clickSearch();
	}
	public void getSearchResult() {
		//searchPage.clickSearch();
		searchPage.getResultFlights();
	}
}
