/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.actionDriver.Action;
import com.mystore.pageObjects.AccountCreationPage;
import com.mystore.pageObjects.HomePage;
import com.mystore.pageObjects.IndexPage;
import com.mystore.pageObjects.LoginPage;
import com.mystorte.base.BaseClass;

/**
 * @author DELL
 *
 */
public class AccountCreationTest  extends BaseClass {
	
	static Action action=new Action();
	IndexPage indexpage;
	LoginPage loginpage;
	AccountCreationPage accountcreationpage;
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
	public void verifycreateaccountpage()
	{
		indexpage=new IndexPage();
		loginpage=indexpage.clickonsignIn();
		accountcreationpage=loginpage.craetenewaccount("manjushborse235@gmail.com");
		boolean result=accountcreationpage.validateaccountcreatepage();
		Assert.assertTrue(result);
		System.out.println("account create success");
	}
	
}
