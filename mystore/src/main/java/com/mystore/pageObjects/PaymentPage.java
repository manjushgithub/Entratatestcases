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
public class PaymentPage extends BaseClass {
	static Action Action=new Action();
	
	@FindBy(xpath="//a[@title=\"Pay by bank wire\"]")
	WebElement bankwiremethod;
	
	@FindBy(xpath = "//a[contains(text(),'Pay by check')]")
	private WebElement payByCheckMethod;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderSummaryPage clickOnPaymentMethod() throws Throwable {
		Action.click(driver, bankwiremethod);
		return new OrderSummaryPage();
	}


}
