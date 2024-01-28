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
public class OrderSummaryPage extends BaseClass {
	static Action Action=new Action();
	
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
private WebElement confirmOrderBtn;
	
	public OrderSummaryPage() {
		PageFactory.initElements(driver, this);
	}

	public OrderConfirmationPage clickOnconfirmOrderBtn() throws Throwable {
		
		Action.click(driver, confirmOrderBtn);
		Action.fluentWait(driver, confirmOrderBtn, 10);
		return new OrderConfirmationPage();
	}
	
}
