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
public class ShippingPage extends BaseClass {
	static Action Action=new Action();
	
	@FindBy(id="cgv")
	WebElement terms;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedToCheckOutBtn;
	
	public ShippingPage()
	{
		PageFactory.initElements(driver, this);
		//this will initialze the value of all the objects of the calss of webelements
	}
	
	public void clickoncheckbox()
	{
		Action.click(driver, terms);
	}
	
	public PaymentPage clickonproceedrochecjout()
	{
		Action.click(driver, proceedToCheckOutBtn);
		return new PaymentPage();
	}

}
