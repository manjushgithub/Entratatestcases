/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.actionDriver.Action;
import com.mystore.pageObjects.AddToCartPage;
import com.mystore.pageObjects.IndexPage;
import com.mystore.pageObjects.LoginPage;
import com.mystore.pageObjects.SearchResultPage;
import com.mystorte.base.BaseClass;

/**
 * @author DELL
 *
 */
public class AddTocartpageTest extends BaseClass {
	
	static Action action=new Action();
	IndexPage indexpage;
	LoginPage loginpage;
	SearchResultPage searchresultpage;
	AddToCartPage addTocartpage;
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
	public void addtocart() throws InterruptedException
	{
		indexpage=new IndexPage();
		searchresultpage=indexpage.searchProduct("t-shirt");
		addTocartpage=searchresultpage.clickonproduct();
		Thread.sleep(1000);
		addTocartpage.enterquantity("2");
		addTocartpage.selectsize("M");
		addTocartpage.clickaddtocart();
		boolean ans=addTocartpage.validateaddtocart();
		Assert.assertTrue(ans);
	}


}
