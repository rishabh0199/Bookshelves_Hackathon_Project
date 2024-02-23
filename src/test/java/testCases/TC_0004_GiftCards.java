package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pageObjects.GiftsCardHomePage;
import testBase.BaseClass;

public class TC_0004_GiftCards extends BaseClass{
	
	GiftsCardHomePage gcp;
	JavascriptExecutor js ;
	
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

