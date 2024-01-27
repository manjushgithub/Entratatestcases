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
import com.mystorte.base.BaseClass;

/**
 * @author DELL
 *manjush
 */
public class IndexPageTest extends BaseClass {
	
	static Action action=new Action();
	IndexPage indexpage;
	//always lauch first
	@BeforeMethod
	public void setup()
	{
		launchApp();
	}
	
	@Test
	public void verifyLogo()
	{
		indexpage=new IndexPage();
		boolean result=indexpage.validateLogo();
		Assert.assertTrue(result);	
	}
	@Test
	public void verifyTitle()
	{
		indexpage=new IndexPage();
		String title=indexpage.getMystoreTitle();
		Assert.assertEquals(title, "My Shop");
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
