package entrata.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import entrata.actionDriver.Action;
import entrata.base.BaseClass;

public class demopage extends BaseClass  {
	
	static Action action=new Action();
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement watchdemobuttom;
	
	
	public demopage()
	{
		PageFactory.initElements(driver, this);
	}
	public String demotitle()
	{
		String ip=action.getTitle(driver);
		return ip;
	}
	public boolean enabled()
	{
		return action.isEnabled(driver, watchdemobuttom);
	}
	
	
	
	
	
	
}
