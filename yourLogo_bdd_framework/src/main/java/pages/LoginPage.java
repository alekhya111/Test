package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;



public class LoginPage {
	
	
	public static  WebDriver driver;
	
	@FindBy(xpath = " //*[@class='login']")
	static
	WebElement signinbutton;
	
	@FindBy(xpath = "//input[@id='email']")
	static
	 WebElement regemail;
	
	 @FindBy(xpath = "//input[@id='passwd']")
	 static
	 WebElement  regpwd ;
	
	 @FindBy(xpath="//button[@id='SubmitLogin']")
	 static
	 WebElement submitButton ;
	
	 @FindBy(xpath=" //a[@class='logout']")
	 static
	 WebElement signout;
	 

	public static void openBrowser() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "E:\\project-workspace\\yourLogo_bdd_framework\\servers\\chromebrowserserver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	
	public static void enterOpenUrl() throws Throwable {
	    driver.get("http://automationpractice.com/");
	}

	public static void clickOnSignIn() throws Throwable {
	    
		signinbutton.click();
	}

	public static void enterUsernameAndPassword() throws Throwable {
		Thread.sleep(2000);
		regemail.sendKeys("Reeha@gmail.com");
		regpwd.sendKeys("5%GV()HH");
		
	}
	
	public static void clickOnLoginButton() throws Throwable {
		submitButton.click();
	}

	public static void verifyUserLoginWebpage() throws Throwable {
		String captureText = signout.getText();
		Assert.assertEquals(true, captureText.contains("Sign out"));
		signout.click();
		
	}


}
