package com.qa.cleartrip.components;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.qa.cleartrip.excelUtil.ClearTripExcelUtil;

public class CleatTripFlightsPage {

	public static Select s1;
	public static Select s2;

	public static ClearTripExcelUtil reader = new ClearTripExcelUtil(
			".\\src\\main\\resources\\ExcelDocument\\ClearTripExcelRead.xlsx");
	public static int rowcount = reader.getRowCount("FlightsPageData");

	@FindBy(xpath = "//input[@id='RoundTrip']")
	static WebElement roundTrip;

	@FindBy(xpath = "//input[contains(@id,'FromT')]")
	static WebElement from;

	@FindBy(xpath = "//input[@id='ToTag']")
	static WebElement to;

	@FindBy(xpath = "//*[@id='DepartDate']")
	static WebElement departDate;

	@FindBy(xpath = "(//a[text()='25'])[1]")
	static WebElement departDateEnter;

	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[2]/a")
	static WebElement returnOn;

	@FindBy(xpath = "//select[@id='Adults']")
	static WebElement adult;

	@FindBy(xpath = "//select[@id='Childrens']")
	static WebElement children;

	@FindBy(xpath = "//select[@id=\"Infants\"]")
	WebElement infant;

	@FindBy(xpath = "//*[@id=\"SearchBtn\"")
	static WebElement searFlightsBtn;

	public static void searchFlights() throws Exception {

		reader.addColumn("FlightsPageData", "status");

		for (int rowNum = 2; rowNum <= rowcount; rowNum++) {

			String depplace = reader.getCellData("FlightsPageData", "DeparturePlace", rowNum);
			String arrivalplace = reader.getCellData("FlightsPageData", "ArrivalPlace", rowNum);
			String datepic = reader.getCellData("FlightsPageData", 3, rowNum);
			
			roundTrip.click();
			from.sendKeys(depplace);
			to.sendKeys(arrivalplace);
		//	departDate.sendKeys(datepic,Keys.ENTER);
			departDate.click();
			departDateEnter.click();
			Thread.sleep(2000);
			returnOn.click();
			s1 = new Select(adult);
			s1.selectByIndex(1);
			s2 = new Select(children);
			s2.selectByVisibleText("2");
			Thread.sleep(1000);
			reader.setCellData("FlightsPageData", "Status", rowNum, "pass");
		}
	}

	public static void clickonSearchFlights() {
		searFlightsBtn.click();
	}

}
