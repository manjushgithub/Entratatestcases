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
	
	@FindBy(xpath="//input[@type=\"checkbox\"]")
	WebElement terms;
	
	@FindBy(xpath="//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedToCheckOutBtn;
	
	public ShippingPage()
	{
		PageFactory.initElements(driver, this);
		//this will initialze the value of all the objects of the calss of webelements
	}
	
	public void clickoncheckbox()
	{
		Action.fluentWait(driver, terms, 15);
		Action.click(driver, terms);
	}
	
	public PaymentPage clickonproceedrochecjout() throws InterruptedException
	{
	Thread.sleep(1000);
		Action.click(driver, proceedToCheckOutBtn);
		Action.fluentWait(driver, terms, 20);
		return new PaymentPage();
	}

}
