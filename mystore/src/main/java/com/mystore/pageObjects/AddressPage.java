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
public class AddressPage extends BaseClass {
	static Action Action=new Action();
	
	@FindBy(xpath="//span[text()=\"Proceed to checkout\"]")
	WebElement proceedtocheout;
	
	public AddressPage()
	{
		PageFactory.initElements(driver, this);
		//this will initialze the value of all the objects of the calss of webelements
	}
	
	public ShippingPage clickoncheckout()
	{
		Action.click(driver, proceedtocheout);
		return new ShippingPage();
	}




}
