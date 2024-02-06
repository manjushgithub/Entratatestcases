package entrata;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import entrata.actionDriver.Action;
import entrata.base.BaseClass;
import entrata.pageObjects.demopage;
import entrata.pageObjects.homepage;
import entrata.pageObjects.signinpage;

public class SignInTest extends BaseClass {
	
	static Action action=new Action();
	homepage homepageobj=new homepage();
	signinpage signinpageobj=new signinpage();
	
	//always launch first
	@BeforeClass
	public void setup()
	{
		launchApp();
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	@Test
	public void propertybuttontest()
	{
		homepageobj=new homepage();
		signinpageobj=homepageobj.signbutton();
		boolean proprty=signinpageobj.propertenabled();
		Assert.assertTrue(proprty);
		System.out.println("1st case of sign-in page");	
		String text=signinpageobj.titletextproprt();
		String exp="Property Manager Login";
		Assert.assertEquals(text, exp);
		System.out.println("2nd case of sign-in page");	
	}
	public void residentbuttontest()
	{
		homepageobj=new homepage();
		signinpageobj=homepageobj.signbutton();
		boolean proprty=signinpageobj.residentenabled();
		Assert.assertTrue(proprty);
		System.out.println("3rd case of sign-in page");	
		String text=signinpageobj.titletextresident();
		String exp="Resident Login";
		Assert.assertEquals(text, exp);
		System.out.println("4th case of sign-in page");	
	}

}
