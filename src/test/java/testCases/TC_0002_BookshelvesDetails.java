package testCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageObjects.BookshelevesHomePage;
import testBase.BaseClass;
import utilities.ExcelWrite;

public class TC_0002_BookshelvesDetails extends BaseClass{
	
    BookshelevesHomePage bhp;
	public static Actions action;
	public static String[] bookShelves;
	public static String[] prices;
	
	
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
		
		System.out.println("The Bookshelevs under 15000:-");
		for(int i=0; i<3; i++) {
			System.out.println(bookShelves[i] + " - Rs." + prices[i]);
			
		}
		
	}
	
	

}
