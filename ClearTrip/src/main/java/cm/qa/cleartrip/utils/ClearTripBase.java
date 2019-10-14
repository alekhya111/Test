package cm.qa.cleartrip.utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.cleartrip.base.ClearTripConfigureProperties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearTripBase extends ClearTripConfigureProperties {
	public static String b;
	public static WebDriver driver;

	public static void openBrowser() throws Exception {

		b = init();
		System.out.println(b);

		if (b.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (b.equalsIgnoreCase(ClearTripConstantUtils.browser)) {
			/*System.setProperty("webdriver.gecko.driver", ClearTripConstantUtils.firefoxPath);
			driver = new FirefoxDriver();*/
			WebDriverManager.firefoxdriver().setup();
		}
	}

	public void openUrl(String url) {
		driver.get(url);

	}

	public void maxBrowser() {
		driver.manage().window().maximize();
	}

	public void timeOut() {
		driver.manage().timeouts().implicitlyWait(ClearTripConstantUtils.implicitWait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(ClearTripConstantUtils.pageLoadTimeOut, TimeUnit.SECONDS);
	}
	
	public void failed() {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("D:\\project-workspace\\ClearTrip\\FailedScreenshots\\aa.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
