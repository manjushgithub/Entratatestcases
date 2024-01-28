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
public class OrderPage extends BaseClass {
	static Action Action=new Action();
	
	@FindBy(xpath="//td[@class=\"cart_unit\"]//ul//li")
	WebElement unitprice;
	
	@FindBy(xpath="//span[@id=\"total_price\"]")
	WebElement totalprice;
	
	@FindBy(xpath="//a//span[text()=\"Proceed to checkout\"]")
	WebElement proceedtocheout;
	
	public OrderPage()
	{
		PageFactory.initElements(driver, this);
	}
	public double getUnitPrice()
	{
		String unitprice1=unitprice.getText();
		String unit=unitprice1.replaceAll("[^a-zA-Z0-9]","");
	double finalunitprice=	Double.parseDouble(unit);
	return finalunitprice;//bcz that regex remove decimal point as well tahts why divide by 100
	}
	public double getTotalPrice() {
		String totalPrice1=totalprice.getText();
		String tot=totalPrice1.replaceAll("[^a-zA-Z0-9]","");
		double finalTotalPrice=Double.parseDouble(tot);
		return finalTotalPrice;
	}
	public LoginPage clickOnCheckOut() throws Throwable {
		Action.click(driver, proceedtocheout);
		Action.fluentWait(driver, proceedtocheout, 10);
		return new LoginPage();
	}
	


}
