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
public class OrderConfirmationPage extends BaseClass {
	static Action Action=new Action();
	
	@FindBy(xpath="//p[contains(text(),'Your order on My Shop is complete.')]")
	private WebElement confirmmsg;
		
		public OrderConfirmationPage() {
			PageFactory.initElements(driver, this);
		}
	
		public String validatemsg() {
			
			String confirmmsges=confirmmsg.getText();
			return confirmmsges;
		}
	

}
