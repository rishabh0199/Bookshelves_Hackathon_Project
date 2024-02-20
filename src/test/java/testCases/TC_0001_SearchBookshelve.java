package testCases;

import org.testng.annotations.Test;
import pageObjects.UrbanLadderHomePage;
import testBase.BaseClass;

public class TC_0001_SearchBookshelve extends BaseClass{
	 UrbanLadderHomePage uhp;
		
		@Test(priority = 1)
		public void sendInSearch()
		{
			uhp = new UrbanLadderHomePage(driver);
			uhp.inputBox();
		}
		
		@Test(priority = 2)
		public void clicksearch()
		{
			uhp.clickSearch();
		}
}
