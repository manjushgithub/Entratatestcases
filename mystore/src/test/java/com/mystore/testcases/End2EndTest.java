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
import com.mystore.pageObjects.AddressPage;
import com.mystore.pageObjects.IndexPage;
import com.mystore.pageObjects.LoginPage;
import com.mystore.pageObjects.OrderConfirmationPage;
import com.mystore.pageObjects.OrderPage;
import com.mystore.pageObjects.OrderSummaryPage;
import com.mystore.pageObjects.PaymentPage;
import com.mystore.pageObjects.SearchResultPage;
import com.mystore.pageObjects.ShippingPage;
import com.mystorte.base.BaseClass;

/**
 * @author DELL
 *
 */
public class End2EndTest  extends BaseClass {
	
	static Action action=new Action();
	IndexPage indexpage;
	LoginPage loginpage;
	AddressPage addresspage;
	SearchResultPage searchresultpage;
	AddToCartPage addTocartpage;
	OrderPage orderpage;
	ShippingPage shippingpage;
	PaymentPage paymentpage;
	OrderSummaryPage orderSummaryPage;
	OrderConfirmationPage orderconfirmationpage;
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
	public void endtoendtest() throws Throwable
	{
		indexpage=new IndexPage();
		searchresultpage=indexpage.searchProduct("t-shirt");
		addTocartpage=searchresultpage.clickonproduct();
		//Thread.sleep(1000);
		addTocartpage.enterquantity("2");
		addTocartpage.selectsize("M");
		addTocartpage.clickaddtocart();
		//Thread.sleep(1000);
		orderpage=addTocartpage.clickoncheckout();
		//Thread.sleep(1000);
		loginpage=orderpage.clickOnCheckOut();
		addresspage=loginpage.login1(prop.getProperty("username"), prop.getProperty("password"));
		shippingpage=addresspage.clickoncheckout();
		shippingpage.clickoncheckbox();
		paymentpage=shippingpage.clickonproceedrochecjout();
		orderSummaryPage=paymentpage.clickOnPaymentMethod();
		orderconfirmationpage=orderSummaryPage.clickOnconfirmOrderBtn();
		String actualmsg=orderconfirmationpage.validatemsg();
		String exp="Your order on My Store is complete.";
		Assert.assertEquals(actualmsg, exp);
	}

}
