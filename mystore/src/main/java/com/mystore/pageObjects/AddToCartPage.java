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
public class AddToCartPage extends BaseClass {
	static Action Action=new Action();
	
	@FindBy(id="quantity_wanted")
	WebElement quantity;
	
	@FindBy(id="group_1")
	WebElement size;
	
	@FindBy(xpath="//span[text()=\"Add to cart\"]")
	WebElement addtocart;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]//h2/i")
	WebElement addtocartmsgsucc;
	
	@FindBy(xpath="//span[contains(text(),\"Proceed to checkout\")]")
	WebElement proceedtocheckoutbtn;

	
	public AddToCartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterquantity(String quan)
	{
		Action.fluentWait(driver, quantity, 10);

		Action.type(quantity, quan);
	}
	public void selectsize(String size1)
	{
		Action.fluentWait(driver, size, 10);

		Action.selectByVisibleText(size1, size);
	}
	public void clickaddtocart()
	{
		Action.fluentWait(driver, addtocartmsgsucc, 10);
		Action.click(driver, addtocart);
	}
	public boolean  validateaddtocart()
	{
		Action.fluentWait(driver, addtocartmsgsucc, 10);
		boolean ans=Action.isDisplayed(driver, addtocartmsgsucc);
		return ans;
	}
	
	public OrderPage clickoncheckout()
	{
		Action.fluentWait(driver, addtocartmsgsucc, 10);
		Action.JSClick(driver, proceedtocheckoutbtn);
		return new OrderPage();
	}




}
