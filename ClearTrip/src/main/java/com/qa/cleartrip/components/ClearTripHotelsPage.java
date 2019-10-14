package com.qa.cleartrip.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ClearTripHotelsPage extends CleatTripFlightsPage {
	
	static Select s1;
	
	@FindBy(xpath="//li[contains(@class,'hotelApp')]//a[contains(text(),'Hotels')] ")
	static
	WebElement HotelLink;
	
	@FindBy(xpath = "//input[starts-with(@placeholder,'Enter Locality')]")
	static
	WebElement wheretogo;
	
	@FindBy(xpath = "//input[contains(@id,'CheckInDate')]")
	static
	WebElement checkindate;
	
	@FindBy(xpath = "//tr[1]//td[7]//a[1]")
	static
	WebElement pickdepdate;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/a[1]")
	static
	WebElement checkoutdate;
	
	@FindBy(xpath = "//select[@id='travellersOnhome']")
	static
	WebElement noOfTravellers;
	
	@FindBy(xpath = "//input[@id='SearchHotelsButton']")
	static
	WebElement searchHotels;


	public static void searchHotels() throws Exception {
		
		reader.addColumn("HotelPageData", "status");
		
		for(int rowNum=2; rowNum<=rowcount;rowNum++) {
			
		String arrlplace = reader.getCellData("HotelPageData", "arrivalplace", rowNum);
		HotelLink.click();
		wheretogo.sendKeys(arrlplace);
		checkindate.click();
		pickdepdate.click();
		Thread.sleep(2000);
		checkoutdate.click();	
		s1 = new Select(noOfTravellers);
		Thread.sleep(5000);
		s1.selectByIndex(1);
		searchHotels.click();
		reader.setCellData("HotelPageData", "Status", rowNum, "pass");
		}
	}
}
