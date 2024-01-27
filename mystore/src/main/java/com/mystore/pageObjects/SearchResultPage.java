/**
 * 
 */
package com.mystore.pageObjects;

import com.mystore.actionDriver.Action;
import com.mystorte.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * @author DELL
 *
 */
public class SearchResultPage extends BaseClass {
	static Action Action=new Action();
	
	@FindBy(xpath="//*[@id=\"center_column\"]//img")
			WebElement productresult;
	
	public SearchResultPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean isproductavailable()
	{
		return Action.isDisplayed(driver,productresult );
	}
	public AddToCartPage clickonproduct()
	{
		 Action.click(driver, productresult);
		 return new AddToCartPage();
	}


}
