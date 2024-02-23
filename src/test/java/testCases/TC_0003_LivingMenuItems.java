package testCases;


import org.testng.annotations.Test;

import pageObjects.GiftsCardHomePage;
import pageObjects.LivingSubMenuPage;
import testBase.BaseClass;
import utilities.ExcelWrite;

public class TC_0003_LivingMenuItems extends BaseClass{
	public static String[] submenuitems;
	
	LivingSubMenuPage lmp;
	
	
	@Test(priority = 15)
	public void scrollPageUp()
	{
		lmp=new LivingSubMenuPage(driver);
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
		System.out.println("The submenu items under Seating and Chaires:");
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

}
