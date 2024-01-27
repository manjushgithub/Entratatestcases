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
import com.mystore.pageObjects.OrderPage;
import com.mystore.pageObjects.SearchResultPage;
import com.mystorte.base.BaseClass;

/**
 * @author DELL
 *
 */
public class orderpageTest  extends BaseClass {
	
	static Action action=new Action();
	IndexPage indexpage;
	LoginPage loginpage;
	SearchResultPage searchresultpage;
	AddToCartPage addTocartpage;
	OrderPage orderpage;
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
	public void verifytotalprice() throws InterruptedException
	{
		indexpage=new IndexPage();
		searchresultpage=indexpage.searchProduct("t-shirt");
		addTocartpage=searchresultpage.clickonproduct();
		Thread.sleep(1000);
		addTocartpage.enterquantity("2");
		addTocartpage.selectsize("M");
		addTocartpage.clickaddtocart();
		Thread.sleep(2000);
		orderpage=addTocartpage.clickoncheckout();
		Thread.sleep(6000);
		double unitprice=orderpage.getUnitPrice();
		System.out.println("up:"+unitprice);
		double totalprice=orderpage.getTotalPrice();
		System.out.println("tp:"+totalprice);
		double actualprice=(double)(unitprice*2)+7;
		System.out.println("ap:"+actualprice);
		Assert.assertEquals(totalprice, actualprice);
		System.out.println(totalprice+"the value is"+actualprice);

	}

}
