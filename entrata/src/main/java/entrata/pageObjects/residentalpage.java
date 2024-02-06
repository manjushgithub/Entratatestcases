package entrata.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import entrata.actionDriver.Action;
import entrata.base.BaseClass;

public class residentalpage extends BaseClass  {
	
	static Action action=new Action();
	
	@FindBy(xpath="//div[@class='intro-content']//h1[1]")
	WebElement heading;
	
	
	public String gettexttitle()
	{
		String ip=heading.getText();
		return ip;
	}
	public String urlpage()
	{
		String checkurl=action.getCurrentURL(driver);
		return checkurl;
	}
}
