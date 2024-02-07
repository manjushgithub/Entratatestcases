package entrata.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import entrata.actionDriver.Action;
import entrata.base.BaseClass;

public class homepage extends BaseClass {
	Action action=new Action();
	
	@FindBy(xpath="//a[@title='Entrata Home Page']")
	WebElement mystoreLOGO;
	
	
	@FindBy(xpath="//a[@class='button-default solid-dark-button'][normalize-space()='Watch Demo']")
	WebElement demologinbutton;
	
	@FindBy(xpath="//a[@class='mobile-button-default mobile-outline-dark-button']")
	WebElement signinlink;
	
	@FindBy(xpath="//label[@for='section2']")
	WebElement solutionsover;
	@FindBy(xpath="//div[@class='header-drop-nav']//a[@class='fat-nav-links']")
	WebElement alllinks;
	
	
	public homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean  validateLogo()
	{
		return action.isDisplayed(driver,mystoreLOGO );	
	}
	public demopage clickdemobutton()
	{
		action.JSClick(driver, demologinbutton);
		return new demopage();
	}
	public signinpage signbutton()
	{
		action.JSClick(driver, signinlink);
		return new signinpage();
	}
}
