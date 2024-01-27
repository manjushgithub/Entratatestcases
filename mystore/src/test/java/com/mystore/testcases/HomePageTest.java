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
public class HomePageTest extends BaseClass {
	
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
	public void creditslipdisplayed() throws InterruptedException
	{
		indexpage=new IndexPage();
		loginpage=indexpage.clickonsignIn();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));	
	boolean result=	homepage.validatemymycreditslipdisplayed();
	Assert.assertTrue(result);
	System.out.println("validated creditdisplay");
	}
	@Test
	public void myorderhistory() throws InterruptedException
	{
		indexpage=new IndexPage();
		loginpage=indexpage.clickonsignIn();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));	
	boolean result=	homepage.validatemyorderhistoty();
	Assert.assertTrue(result);
	System.out.println("validated orderhistorydisplayed");
	}

}
