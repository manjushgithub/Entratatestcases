package entrata.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import entrata.actionDriver.Action;
import entrata.base.BaseClass;

public class signinpage extends BaseClass  {
	
	static Action action=new Action();
	
	
	@FindBy(xpath="//a[@title='Client Login Button']")//1st link
	WebElement propertymanagerlogin;
	
	@FindBy(xpath="//a[@title='Resident Portal Login Button']")//2nd link
	WebElement residentloginclick;
	
	public signinpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean  propertenabled()
	{
	   return  action.isDisplayed(driver, propertymanagerlogin);
	       
	}
	public String titletextproprt()
	{
	    String text=propertymanagerlogin.getText();  
	    return text;
	}
	public boolean  residentenabled()
	{
	   return  action.isDisplayed(driver, residentloginclick);
	       
	}
	public String titletextresident()
	{
	    String text=residentloginclick.getText();  
	    return text;
	}
	
	public residentalpage clickresiden()
	{
	 action.JSClick(driver, residentloginclick);
	 return new residentalpage();
	}
}

