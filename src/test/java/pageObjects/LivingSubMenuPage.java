package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import testBase.BaseClass;

public class LivingSubMenuPage extends BasePage{
	BaseClass bclass;
	Actions action;
	JavascriptExecutor js;
	public LivingSubMenuPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[text()='Gift Cards']")
	WebElement btnGiftCards;
	
	@FindBy(xpath="//a[@href='/help']")
	WebElement txtxScrollTill;
	
	@FindBy(xpath="//li[@class=\"topnav_item livingunit\"]")
	WebElement optHoverLiving;
	
	@FindBy(xpath="//li[@class=\"topnav_item livingunit\"]//a[contains(text(),\"Seating & Chairs\")]")
	WebElement txtSeatingChair;
	
	@FindAll(@FindBy(xpath="//li[@class=\"topnav_item livingunit\"]//div//div//ul//li[1]//ul//li"))
	List<WebElement> listOfSeatingandChairitems;
	
	public void scrollUp()
	{	
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtxScrollTill);		
	}
	
	public void hoverLiving()
	{
		bclass = new BaseClass();
		action = new Actions(driver);
		bclass.ExplicitlyWait(optHoverLiving);
		action.moveToElement(optHoverLiving).perform();;
	}
	
	public void waitForSubmenuToAppear()
	{
		bclass.ExplicitlyWait(txtSeatingChair);
	}
	
	public List<WebElement> listOFseatingAndChair()
	{
		bclass.ExplicitlyWaitList(listOfSeatingandChairitems);
		return listOfSeatingandChairitems;
	}
	
	public void scrollpage() throws InterruptedException
	{
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}
	
	public void clickGiftCards()
	{
		bclass = new BaseClass();
		bclass.ExplicitlyWait(btnGiftCards);
		//btnGiftCards.click();//getting itercepted error
		js.executeScript("arguments[0].click();",btnGiftCards);
	}
}
