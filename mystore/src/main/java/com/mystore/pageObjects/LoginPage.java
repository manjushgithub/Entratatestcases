/**
 * 
 */
package com.mystore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.Action;
import com.mystorte.base.BaseClass;

/**
 * @author DELL
 *
 */
public class LoginPage extends BaseClass {
	static Action Action=new Action();
	
	@FindBy(id="email")
	WebElement userName;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(xpath="//span[normalize-space()='Sign in']")
	WebElement signInButton;
	
	@FindBy(id="email_create")
	WebElement emailfornewaccount;
	
	@FindBy(id="SubmitCreate")
	WebElement createnewaccountbtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		//this will initialze the value of all the objects of the calss of webelements
	}
  
	public HomePage login(String uname,String pswd) throws InterruptedException//this is normal login first time user 
	{
		Action.type(userName, uname);
		Action.type(password, pswd);
		Action.click(driver, signInButton);

		return new HomePage();
	}
	public AddressPage login1(String uname,String pswd) throws InterruptedException//this is flow when user
	//directly search the prodcut and order it then he has to sign in again move to address page(this is come from order page 
	{
		Action.type(userName, uname);
		Action.type(password, pswd);
		//Action.fluentWait(driver, signInButton, 10);
		Action.click(driver, signInButton);
		
		return new AddressPage();
	}

	public AccountCreationPage craetenewaccount(String newemail)
	{
		Action.type(emailfornewaccount, newemail);
		Action.click(driver, createnewaccountbtn);
		return new AccountCreationPage();
	}


	
	
	
}
