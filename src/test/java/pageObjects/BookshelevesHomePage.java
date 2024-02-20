package pageObjects;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import testBase.BaseClass;

public class BookshelevesHomePage extends BasePage{
	BaseClass bclass;
	public BookshelevesHomePage(WebDriver driver) {
		super(driver);
	}
	Actions action;
	
	@FindBy(xpath="//a[@class='close-reveal-modal hide-mobile']")
	WebElement popupSignUp;
	
	@FindBy(xpath="//h2[contains(text(),\"Search results for\")]")
	
	WebElement txtScrollTill;
	
	@FindBy(xpath="//li[@data-group='category' and @class='item']")
	WebElement optHovercategory;
	
	@FindBy(xpath="//input[@type='checkbox' and @value='Bookshelves']")
	WebElement chkboxBookShelves;
	
	@FindBy(xpath="//li[@data-group='price' and @class='item']")//price
	WebElement optHoverPrice;
	
	
	//@FindBy(css="div.connect")
	@FindBy(xpath="//div[@class='noUi-handle noUi-handle-upper']")//max slider point
	WebElement sliderPrice;
	
	
	@FindBy(xpath="//input[@value='In Stock Only']")
	WebElement btnInStock;
	
	@FindBy(xpath="//div[@data-group='sorting' and @class='item']")
	WebElement optHoverSort;
	
	@FindBy(xpath="//ul[@class=\"sortoptions\"]//li[3]")
	WebElement optHighToLowPrice;
	
	@FindAll(@FindBy(xpath="//*[@id='content']//div[3]//ul//li//div//div[5]//a//div[1]//span"))
	List<WebElement> listBookShelvesName;
	
	@FindAll(@FindBy(xpath="//*[@id='content']//div[3]//ul//li//div//div[5]//a//div[2]//span"))
	List<WebElement> listBookShelvesPrice;
	
	
	public void popupclose() {
		
		try {
			bclass= new BaseClass();
			bclass.ExplicitlyWait(popupSignUp);
			popupSignUp.click();	
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public void scroll()
	{
		
		bclass.ExplicitlyWait(txtScrollTill);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);",txtScrollTill);
	}
	public void hoverCategory()
	{
		action= new Actions(driver);
		bclass.ExplicitlyWait(optHovercategory);
		action = new Actions(driver);
		action.moveToElement(optHovercategory).perform();
	}
	
	
	public void selectCategory()
	{
		bclass.ExplicitlyWait(chkboxBookShelves);
		chkboxBookShelves.click();
	}
	
	public void hoverPrice()
	{
		bclass.ExplicitlyWait(optHoverPrice);
		action.moveToElement(optHoverPrice).perform();
	}
	
	public void waitForSlider()
	{
		bclass.ExplicitlyWait(sliderPrice);
	}
	
	public void slidePrice() throws InterruptedException
	{
		System.out.println("The Current position of the Max slider is"+sliderPrice.getLocation());
		Thread.sleep(9000);
		action.moveToElement(sliderPrice).dragAndDropBy(sliderPrice, -202, 0).perform();
		Thread.sleep(4000);
	}
	
	
	public void hoverSort()
	{
		bclass.ExplicitlyWait(optHoverSort);
		action.moveToElement(optHoverSort).perform();
	}
	
	public void selectSortHighToLow()
	{
		bclass.ExplicitlyWait(optHighToLowPrice);
		optHighToLowPrice.click();
	}
	
	public void inStockSelction()
	{
		bclass.ExplicitlyWait(btnInStock);
		btnInStock.click();
	}
	
	public List<WebElement> bookShelvesNames()
	{
		bclass.ExplicitlyWaitList(listBookShelvesName);
		return listBookShelvesName;
	}
	
	public List<WebElement> bookShelvesPrice()
	{
		bclass.ExplicitlyWaitList(listBookShelvesPrice);
		return listBookShelvesPrice;
	}
	
	

}
