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
public class HomePage extends BaseClass {
	static Action Action=new Action();
	
	@FindBy(xpath="//*[@id=\"center_column\"]//span[text()='Order history and details']")
	WebElement orderhistory;
	
	@FindBy(xpath="//*[@id=\"center_column\"]//span[text()='My credit slips']")
	WebElement mycreditslips;
	
	public HomePage()
	{
		//constructor initilization
		PageFactory.initElements(driver, this);
		//this will initialze the value of all the objects of the calss of webelements
	}
	
	public boolean validatemymycreditslipdisplayed()
	{
		return Action.isDisplayed(driver, mycreditslips);
	}
	
	public boolean validatemyorderhistoty() {
		return Action.isDisplayed(driver, orderhistory);
	}
	public String getCurrentURL()
	{
		String homepageurl=driver.getCurrentUrl();
		return homepageurl;
	}



}
