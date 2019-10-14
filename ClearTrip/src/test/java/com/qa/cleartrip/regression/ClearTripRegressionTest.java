package com.qa.cleartrip.regression;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.qa.cleartrip.components.ClearTripHotelsPage;
import com.qa.cleartrip.components.CleatTripFlightsPage;
import com.qa.cleartrip.reports.CustomListeners;
import com.qa.cleartrip.screenshots.ScreensShots;
import cm.qa.cleartrip.utils.ClearTripBase;
import cm.qa.cleartrip.utils.ClearTripConstantUtils;

@Listeners(CustomListeners.class)
public class ClearTripRegressionTest extends ClearTripBase {

	@BeforeTest
	public void setUp() throws Exception {
		openBrowser();
		openUrl(ClearTripConstantUtils.url);
		timeOut();
		maxBrowser();
	}

	@Test
	public void testingSearchFlights() throws Exception {
		PageFactory.initElements(driver, CleatTripFlightsPage.class);
		driver.navigate().refresh();
		CleatTripFlightsPage.searchFlights();
		CleatTripFlightsPage.clickonSearchFlights();
		timeOut();
		ScreensShots.screenShot1();
	}
	
	
	@Test
	public void testingSearchHotels() throws Exception {
		ClearTripHotelsPage hp = new ClearTripHotelsPage();
		PageFactory.initElements(driver,ClearTripHotelsPage.class);
		driver.navigate().refresh();
		hp.searchHotels();
	}
	

	@AfterTest
	public void after() {
		driver.close();
		
	}

}
