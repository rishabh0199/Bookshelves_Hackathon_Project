package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class GiftsCardHomePage extends BasePage{
	BaseClass bclass;

	public GiftsCardHomePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="(//div[@class='icofont-cross'])[1]")
	WebElement popupGiftCard;

}
