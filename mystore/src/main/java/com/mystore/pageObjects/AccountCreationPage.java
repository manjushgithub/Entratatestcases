/**
 * 
 */
package com.mystore.pageObjects;

import com.mystore.actionDriver.Action;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mystorte.base.BaseClass;

/**
 * @author DELL
 *
 */
public class AccountCreationPage extends BaseClass {
	static Action Action=new Action();
	
	@FindBy(xpath="//h1[text()='Create an account']")
	WebElement formtitle;
	
	public AccountCreationPage()
	{
		//constructor initilization
		PageFactory.initElements(driver, this);
		//this will initialze the value of all the objects of the calss of webelements
	}

	public boolean validateaccountcreatepage()
	{
		return Action.isDisplayed(driver, formtitle);
	}

}
