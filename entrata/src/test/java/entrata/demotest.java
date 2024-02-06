package entrata;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import entrata.actionDriver.Action;
import entrata.base.BaseClass;
import entrata.pageObjects.demopage;
import entrata.pageObjects.homepage;

public class demotest extends BaseClass {
	
	static Action action=new Action();
	homepage homepageobj=new homepage();
	demopage demopageobj;
	
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
	public void demotesttitle()
	{
		homepageobj=new homepage();
		demopageobj=homepageobj.clickdemobutton();
		String op=demopageobj.demotitle();
		
		String Expectedmsg="Property Management Software | Entrata";
		AssertJUnit.assertEquals(op, Expectedmsg);
		System.out.println("test case demo passed-2");
	}
	
	@Test
	public void displaybutonwatchdemo()
	{
		homepageobj=new homepage();
		demopageobj=homepageobj.clickdemobutton();
		boolean checkstatus=demopageobj.enabled();
		AssertJUnit.assertTrue(checkstatus);
		System.out.println("test case demo passed-2-additionalcheck");
	}
}
