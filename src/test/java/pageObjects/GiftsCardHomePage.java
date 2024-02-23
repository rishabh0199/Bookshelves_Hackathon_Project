package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BaseClass;
import utilities.JsonRead;

public class GiftsCardHomePage extends BasePage{
	BaseClass bclass;
	JavascriptExecutor js ;
	public String validationMessage;

	public GiftsCardHomePage(WebDriver driver) {
		super(driver);
	}
	

	
	@FindBy(xpath="//h2[contains(text(),'1. First, choose an occasion')]")
	WebElement txtscrollTillGifts;
	
	@FindBy(xpath="//h3[contains(text(),'Birthday')]")
	WebElement optbirthDayOrAnniversary;
	
	@FindBy(xpath="//input[@placeholder='Amount']")
	WebElement txtBoxfindingAmount;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement btnnextButton;
	
	@FindBy(name="recipient_name")
	WebElement txtBoxrecepientName;
	
	@FindBy(name="recipient_email")
	WebElement txtBoxrecepientEmail;
	
	@FindBy(name="recipient_mobile_number")
	WebElement txtBoxrecipientMobile;
	
	@FindBy(name="customer_name")
	WebElement txtBoxcustomerName;
			
	@FindBy(name="customer_email") 
	WebElement txtBoxcustomerEmail;
	
	@FindBy(name="customer_mobile_number")
	WebElement txtBoxcustomerMobileNumber;
	
	
	@FindBy(name="customer_address")
	WebElement txtBoxcustomerAddress ;
	
	@FindBy(name="zip")
	WebElement txtBoxZip;
		
	@FindBy(name="message")
	WebElement txtBoxoptionalMessage;
	
	@FindBy(xpath="//button[text()='Confirm']")
	WebElement btnconfirmButton;
	

	
	public void testCaseReadJSON() {
	
	try {
		
		JsonRead.readJSONFile();
		
	} catch(Exception e) {
		
		e.printStackTrace();
		
	}
	
}
	
	public void scrollDownToGifts()
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",txtscrollTillGifts);
	}
	
	public void clickOnBirthdayOrAnniversary() 
	{
		bclass=new BaseClass();
		bclass.ExplicitlyWait(optbirthDayOrAnniversary);
		optbirthDayOrAnniversary.click();		
	}
	
	
	public  void enteringAmount() {
		
		bclass.ExplicitlyWait(txtBoxfindingAmount);
		txtBoxfindingAmount.sendKeys(JsonRead.amount);
		
	}
	
	
	public  void clickOnNext() 
	{
		
		bclass.ExplicitlyWait(btnnextButton);
		btnnextButton.click();
		
	}
	
	
	public  void enterRecipientName() 
	{
		
		bclass.ExplicitlyWait(txtBoxrecepientName);
		txtBoxrecepientName.sendKeys(JsonRead.recipientName);
		
	}
	
	
	public void enterRecipientEmail() 
	{
		bclass.ExplicitlyWait(txtBoxrecepientEmail);
		txtBoxrecepientEmail.sendKeys(JsonRead.recipientEmail);

		
	}

	public void enterRecipientMobile()
	{
		bclass.ExplicitlyWait(txtBoxrecipientMobile);
		txtBoxrecipientMobile.sendKeys(JsonRead.recipientmobile);
	}
	
	public void enterCustomerName() 
	{
		
		bclass.ExplicitlyWait(txtBoxcustomerName);
		txtBoxcustomerName.sendKeys(JsonRead.customerName);
		
	}
	
	
	public void enterCustomerEmail() 
	{
		
		bclass.ExplicitlyWait(txtBoxcustomerEmail);
		txtBoxcustomerEmail.sendKeys(JsonRead.customerEmail);
		
	}
	
	
	public void enterCustomerMobileNumber() 
	{
		bclass.ExplicitlyWait(txtBoxcustomerMobileNumber);
		txtBoxcustomerMobileNumber.sendKeys(JsonRead.customerMobile);

		
	}
	
	
	public void enterCustomerAddress() 
	{
		bclass.ExplicitlyWait(txtBoxcustomerAddress);
		txtBoxcustomerAddress.sendKeys(JsonRead.customerAddress);
		
	}
	
	
	public void enterCustomerPin()
	{
		bclass.ExplicitlyWait(txtBoxZip);
		txtBoxZip.sendKeys(JsonRead.customerPin);
	}
	
	public void enterMessage() 
	{
		
		bclass.ExplicitlyWait(txtBoxoptionalMessage);
		txtBoxoptionalMessage.sendKeys(JsonRead.message);
		
	}
	
	
	public void clickOnConfirm() throws InterruptedException 
	{
		bclass.ExplicitlyWait(btnconfirmButton);
		btnconfirmButton.click();
		Thread.sleep(3000);//used so we can see error message

		
	}
	
	public void displayErrorMessage() 
	{
		System.out.println("The Error message got while filling details:-");
		validationMessage = (String)js.executeScript("return arguments[0].validationMessage;",txtBoxrecepientEmail);
	    System.out.println(validationMessage);
	}
	
	public void clearRecipientEmailBox()
	{
		txtBoxrecepientEmail.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		txtBoxrecepientEmail.sendKeys(Keys.DELETE);
	}
	
	public void enterCorrectrecipientEmail()
	{
		bclass.ExplicitlyWait(txtBoxrecepientEmail);
		txtBoxrecepientEmail.sendKeys(JsonRead.correctemail);
	}
	
	public void clickConfirmafterCorrectEmail() throws InterruptedException 
	{
		bclass.ExplicitlyWait(btnconfirmButton);
		btnconfirmButton.click();
		Thread.sleep(3000);//used so we can see error message

		
	}
	
}
