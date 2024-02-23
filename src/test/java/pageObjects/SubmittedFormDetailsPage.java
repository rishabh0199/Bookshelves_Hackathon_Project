package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class SubmittedFormDetailsPage extends BasePage{
	BaseClass bclass;
	
	public SubmittedFormDetailsPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//h2[contains(text(),'Confirm the details')]")
	WebElement txtConfirmDetailsHeading;
	
	@FindBy(xpath="//div[@class=\"BCLqs\"]")
	WebElement amountEntered;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[1]//div[2]//div[1]")
	WebElement recipientName;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[1]//div[2]//div[2]")
	WebElement recipientEmail;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[1]//div[2]//div[3]")
	WebElement recipientMobile;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[2]//div[2]//div[1]")
	WebElement customerName;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[2]//div[2]//div[2]")
	WebElement customerEmail;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[2]//div[2]//div[3]")
	WebElement customerMobile;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[2]//div[2]//div[4]")
	WebElement customerCity;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[2]//div[2]//div[5]")
	WebElement customerPinCode;//split basis of comma
	
	
	
	
	
	public WebElement confirmationDetailsDisplay()
	{
		bclass= new BaseClass();
		bclass.ExplicitlyWait(txtConfirmDetailsHeading);
		//String heading = txtConfirmDetailsHeading.getText();
		return txtConfirmDetailsHeading;
	}
	
	public WebElement amountEnetered()
	{
		bclass.ExplicitlyWait(amountEntered);
		return amountEntered;
	}
	
	public WebElement recipientName()
	{
		bclass.ExplicitlyWait(recipientName);
		return recipientName;
	}
	
	public WebElement recipientEmail()
	{
		bclass.ExplicitlyWait(recipientEmail);
		return recipientEmail;
	}
	
	public WebElement recipientMobile()
	{
		bclass.ExplicitlyWait(recipientMobile);
		return recipientMobile;
	}
	
	public WebElement customerName()
	{
		bclass.ExplicitlyWait(customerName);
		return customerName;
	}
	
	public WebElement customerEmail()
	{
		bclass.ExplicitlyWait(customerEmail);
		return customerEmail;
	}
	public WebElement customerMobile()
	{
		bclass.ExplicitlyWait(customerMobile);
		return customerMobile;
	}
	
	public WebElement customerCity()
	{
		bclass.ExplicitlyWait(customerCity);
		return customerCity;
	}
	
	public WebElement customerPinCode()
	{
		bclass.ExplicitlyWait(customerPinCode);
		return customerPinCode;
	}
	
}
