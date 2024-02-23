package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BaseClass;

public class UrbanLadderHomePage extends BasePage
{
	BaseClass bclass;
	public UrbanLadderHomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='search']")
	WebElement inputBoxSearch;
	
	@FindBy(xpath="//button[@id=\"search_button\"]")
	WebElement btnSearch;
	

	
	public void inputBox()
	{
		bclass = new BaseClass();
		bclass.ExplicitlyWait(inputBoxSearch);
		inputBoxSearch.click();
		inputBoxSearch.sendKeys("BookShelves");
	}
	
	public void clickSearch()
	{
		bclass.ExplicitlyWait(btnSearch);
		btnSearch.click();
	}
	

}
