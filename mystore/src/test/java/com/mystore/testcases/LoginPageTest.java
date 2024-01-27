/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.actionDriver.Action;
import com.mystore.pageObjects.HomePage;
import com.mystore.pageObjects.IndexPage;
import com.mystore.pageObjects.LoginPage;
import com.mystorte.base.BaseClass;

/**
 * @author DELL
 *
 */
public class LoginPageTest extends BaseClass {
	
	static Action action=new Action();
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
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
	public void logintest() throws InterruptedException
	{
		indexpage=new IndexPage();
		loginpage=indexpage.clickonsignIn();//this will return object of loginpage//page chaining
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		String actualurl=homepage.getCurrentURL();
		String expectedurl="http://www.automationpractice.pl/index.php?controller=my-account";
		Assert.assertEquals(actualurl,expectedurl);
	}

}
