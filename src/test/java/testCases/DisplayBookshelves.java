package testCases;


import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageObjects.BookshelevesHomePage;
import pageObjects.GiftsCardHomePage;
import pageObjects.LivingSubMenuPage;
import pageObjects.UrbanLadderHomePage;
import testBase.BaseClass;
import utilities.ExcelWrite;


public class DisplayBookshelves extends BaseClass {

    UrbanLadderHomePage uhp;
    BookshelevesHomePage bhp;
    LivingSubMenuPage lmp;
    GiftsCardHomePage gcp;
    
    
	public static Actions action;
	public static String[] bookShelves;
	public static String[] prices;
	public static String[] submenuitems;
	
	@Test(priority = 1)
	public void sendInSearch()
	{
		uhp= new UrbanLadderHomePage(driver);
		uhp.inputBox();
	}
	
	@Test(priority = 2)
	public void clicksearch()
	{
		uhp.clickSearch();
	}
	
	@Test(priority = 3)
	public void closePopUp() {
		bhp = new BookshelevesHomePage(driver);
		bhp.popupclose();
		
	}
	@Test(priority = 4)
	public void scrollDown()
	{
		bhp.scroll();
	}
	@Test(priority = 5)
	public void hoverCategory()
	{
		bhp.hoverCategory();
	}
	@Test(priority = 6)
	public void bookshelveCategory()
	{
		bhp.selectCategory();
	}
	@Test(priority = 7)
	public void hoverToPrice()
	{
		bhp.hoverPrice();
	}
	@Test(priority = 8)
	public void waitPriceSlider()
	{
		bhp.waitForSlider();
	}
	@Test(priority = 9)
	public void slidePriceamount() throws InterruptedException
	{
		bhp.slidePrice();
	}

	@Test(priority = 10)
	public void hoverSortBy()
	{
		bhp.hoverSort();
	}
	@Test(priority = 11)
	public void sortAccToPrice()
	{
		bhp.selectSortHighToLow();
	}
	
	@Test(priority = 12)
	public void inStock()
	{
		bhp.inStockSelction();
	}
	
	@Test(priority = 13)
	public void collectingBookShelvesList() {
		
		bookShelves = new String[bhp.bookShelvesNames().size()];
		prices = new String[bhp.bookShelvesPrice().size()];
		
		for(int i=0; i<bhp.bookShelvesNames().size(); i++) {
			
			bookShelves[i] = bhp.bookShelvesNames().get(i).getText();
			prices[i] = bhp.bookShelvesPrice().get(i).getText();
			prices[i] = prices[i].replaceAll("[^0-9]", "");
			
		}
		ExcelWrite.setDataExcel(bookShelves , prices , 3);
	}
	
	@Test(priority = 14)
	public void displayingBookShelves() {
			
		for(int i=0; i<3; i++) {
			
			System.out.println(bookShelves[i] + " - Rs." + prices[i]);
			
		}
		
	}
	
	@Test(priority = 15)
	public void scrollUpToLogo()
	{
		lmp.scrollUp();
	}
	
	
	@Test(priority = 16)
	public void hoverToLiving()
	{
		lmp.hoverLiving();
	}
	@Test(priority = 17)
	public void waitforSubmenu()
	{
		lmp.waitForSubmenuToAppear();
	}
	@Test(priority = 18)
	public void submenuSeatingandChairStoreInExcel()
	{
		lmp=new LivingSubMenuPage(driver);
		
		submenuitems= new String[lmp.listOFseatingAndChair().size()];
		
		for(int i=0;i<lmp.listOFseatingAndChair().size();i++)
		{
			submenuitems[i]= lmp.listOFseatingAndChair().get(i).getText();
		}
		ExcelWrite.setDataExcel(submenuitems, lmp.listOFseatingAndChair().size());
	}
	@Test(priority = 19)
	public void displaySubMenuSeatingandChair()
	{
		for(int i=0;i<lmp.listOFseatingAndChair().size();i++)
		{
			System.out.println(submenuitems[i]);
		}
	}
	
	@Test(priority = 20)
	public void scrollPage() throws InterruptedException
	{
		lmp.scrollpage();
	}
	
	@Test(priority = 21)
	public void clickGiftCardsButton()
	{
		
		lmp.clickGiftCards();
	}
	
	@Test(priority = 22)
	public void loadTheJSONFile()
	{
		gcp =new GiftsCardHomePage(driver);
		gcp.testCaseReadJSON();
	}

	
	@Test(priority = 23)
	public void scrollDownToGiftsOptions()
	{
		
		gcp.scrollDownToGifts();
	}
	
	@Test(priority = 24)
	public void selectBirthdayOrAnniversary() 
	{
		gcp.clickOnBirthdayOrAnniversary();
	}
	
	@Test(priority = 25)
	public  void enteringPriceAmount() 
	{
		
		gcp.enteringAmount();
		
	}
	
	@Test(priority = 26)
	public  void clickOnNextbtn() 
	{
		
		gcp.clickOnNext();
		
	}
	
	@Test(priority = 27)
	public  void enterNameofRecipient() 
	{
		
		gcp.enterRecipientName();
		
	}
	
	@Test(priority = 28)
	public void enterEmailofRecipient() 
	{
		
		gcp.enterRecipientEmail();
		
	}
	@Test(priority = 29)
	public void enterMobileofRecipient() 
	{
		
		gcp.enterRecipientMobile();
		
	}
	
	
	@Test(priority = 30)
	public void enterNameofCustomer() 
	{
		
		gcp.enterCustomerName();
		
	}
	
	@Test(priority = 31)
	public void enterEmailofCustomer() 
	{
		
		gcp.enterCustomerEmail() ;
	}
	
	@Test(priority = 32)
	public void enterMobileNumberofCustomer() 
	{
		
		gcp.enterCustomerMobileNumber();
		
	}
	@Test(priority = 33)
	public void enterAddressofCustomer() 
	{
		
		gcp.enterCustomerAddress();
		
	}
	
	@Test(priority = 34)
	public void enterPinofCustomerPin()
	{
		gcp.enterCustomerPin();
	}
	
	@Test(priority = 35)
	public void enterMessageIfAny() 
	{
		
		gcp.enterMessage();
		
	}
	
	@Test(priority = 36)
	public void clickOnConfirmbtn() throws InterruptedException 
	{
	
		gcp.clickOnConfirm();
		
	}
	@Test(priority = 37)
	public void getErrorMessage()
	{
		gcp.displayErrorMessage();
	}
	
	@Test(priority = 38)
	public void clearrecipientmail()
	{
		gcp.clearRecipientEmailBox();
	}
	
	@Test(priority = 39)
	public void enterCorrectDeatils()
	{
		gcp.enterCorrectrecipientEmail();
	}
	
	@Test(priority = 40)
	public void clickConfirmWithcorrectEmail() throws InterruptedException
	{
		gcp.clickConfirmafterCorrectEmail();
	}
	
}
