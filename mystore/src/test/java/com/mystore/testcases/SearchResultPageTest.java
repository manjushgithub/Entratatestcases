/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.actionDriver.Action;
import com.mystore.pageObjects.IndexPage;
import com.mystore.pageObjects.LoginPage;
import com.mystore.pageObjects.SearchResultPage;
import com.mystorte.base.BaseClass;

/**
 * @author DELL
 *
 */
public class SearchResultPageTest  extends BaseClass {
	
	static Action action=new Action();
	IndexPage indexpage;
	LoginPage loginpage;
	SearchResultPage searchresultpage;
	@BeforeMethod
	public void setup()
	{
		launchApp();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	@Test
	public void productavailabilitytest() throws InterruptedException{
		
		indexpage=new IndexPage();
		searchresultpage=indexpage.searchProduct("t-shirt");//hardcoding
		Thread.sleep(2000);
		boolean result=searchresultpage.isproductavailable();
		Assert.assertTrue(result);
		System.out.println("product is searched");
	}

}
