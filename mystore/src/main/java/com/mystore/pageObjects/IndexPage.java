package com.mystore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.Action;
import com.mystorte.base.BaseClass;

public class IndexPage extends BaseClass {
	static Action Action=new Action();

	//now write down the page objects and methods reqiuire for this page
//we write in the form of pagefactory methods we ahve annotation findby
	@FindBy(xpath="//a[@class='login']")
	WebElement signInbtn;
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	WebElement mystoreLOGO;
	
	@FindBy(id="search_query_top")
	WebElement searchbox;
	
	@FindBy(name="submit_search")
	WebElement searchButton;
	//now we have to initialize all the webelement via constructor
	
	public IndexPage()
	{
		PageFactory.initElements(driver, this);
		//this will initialze the value of all the objects of the calss of webelements
	}
	public LoginPage clickonsignIn()
	{
		Action.fluentWait(driver, signInbtn, 10);
		Action.click(driver, signInbtn);
		return new LoginPage();
	}//connection here bcz when we clicked on sign in lands to login page object
	//so create  of object we can do on login page.
	
	public boolean  validateLogo()
	{
		return Action.isDisplayed(driver,mystoreLOGO );	
	}
	public String getMystoreTitle()
	{
		String mystoretitle=driver.getTitle();
		return mystoretitle;
	}

	public SearchResultPage searchProduct(String ProductName)
	{
		Action.type(searchbox, ProductName);
		Action.click(driver, searchButton);
		return new SearchResultPage();
	}
}
