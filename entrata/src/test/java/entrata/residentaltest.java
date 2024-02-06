package entrata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import entrata.actionDriver.Action;
import entrata.base.BaseClass;
import entrata.pageObjects.homepage;
import entrata.pageObjects.residentalpage;
import entrata.pageObjects.signinpage;

public class residentaltest extends BaseClass {
	
	static Action action=new Action();
	homepage homepageobj=new homepage();
	signinpage signinpageobj=new signinpage();
	residentalpage residentalpageobj=new residentalpage();
	
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
	public void pageurlresi()
	{
		
		homepageobj=new homepage();
		signinpageobj=homepageobj.signbutton();
		residentalpageobj=signinpageobj.clickresiden();
		String ans=residentalpageobj.urlpage();
		String exp="https://www.residentportal.com/";
		Assert.assertEquals(ans, exp);
		System.out.println("firstcaseofresidency");

	}
}
//	@Test
//	public void residentialbuttontest()
//	{
//		homepageobj=new homepage();
//		signinpageobj=homepageobj.signbutton();
//		residentalpageobj=signinpageobj.clickresiden();
//		String ans=residentalpageobj.;
//		String exp="Welcome to\r\n" + 
//				"Resident"
//				+ "P"
//				+ "ortal";
//		Assert.assertEquals(ans, exp);
//		System.out.println("secondcaseofresidency");
//
//}}
