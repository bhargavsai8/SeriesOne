package com.generalone.SeriesOne.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Listeners.LoggerClass;
import Pages.HomePage;
import junit.framework.Assert;

public class HomePageTest extends BaseClass{
	
	HomePage home;
	
	public HomePageTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void initAll()
	{
		LoggerClass.infoTest("Entering the Before Method");
		init();
		LoggerClass.infoTest("Creating a new home page object");
		home = new HomePage();
		
	}
	
	@AfterMethod
	public void quitAll()
	{
		LoggerClass.infoTest("We are in After Method");
		driver.quit();
	}
	
	@Test
	public void searchSomething()
	{
		LoggerClass.startTest("Search Something");
		home.searchText();
		//Assert.assertTrue(false);
		LoggerClass.endTest("Search Something");
	}
	
	
	
}
