package com.generalone.SeriesOne.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Listeners.LoggerClass;
import Pages.HomePage;
import Pages.SearchPage;

public class SearchPageTest extends BaseClass{
	
	HomePage home;
	SearchPage search;
	
	public SearchPageTest()
	{
		super();
	}

	@BeforeMethod(alwaysRun=true)
	public void initAll()
	{
		LoggerClass.infoTest("Entering the Before Method");
		init();
		LoggerClass.infoTest("Creating a new home page object");
		home = new HomePage();
		
		search = home.searchText();
	}
	
	@AfterMethod(alwaysRun=true)
	public void quitAll()
	{
		LoggerClass.infoTest("We are in After Method");
		driver.quit();
	}
	
	@Test
	public void clickInSearchPage()
	{
		LoggerClass.startTest("Click in Search Page");
		search.clickOnText();
		//Assert.assertTrue(false);;
		LoggerClass.endTest("Click in Search Page");
	}
	
}
