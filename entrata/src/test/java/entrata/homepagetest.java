package entrata;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import entrata.actionDriver.Action;
import entrata.base.BaseClass;
import entrata.pageObjects.homepage;

public class homepagetest extends BaseClass {
	
	static Action action=new Action();
	homepage homepageobj=new homepage();
	
	//always launch first
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
	public void verifyLogo()
	{
		homepageobj=new homepage();
		boolean result=homepageobj.validateLogo();
		AssertJUnit.assertTrue(result);
		System.out.println("test case home passed-1");
}
}
