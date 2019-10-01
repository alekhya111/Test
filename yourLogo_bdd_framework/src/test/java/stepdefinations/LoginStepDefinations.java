package stepdefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class LoginStepDefinations {

	public static WebDriver driver;

	@Given("^open browser$")
	public void open_browser() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"E:\\project-workspace\\yourLogo_bdd_framework\\servers\\chromebrowserserver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("^enter open url \"([^\"]*)\"$")
	public void enter_open_url(String url) throws Throwable {
		driver.get(url);
	}

	@When("^click on  signIn$")
	public void click_on_signIn() throws Throwable {
		driver.findElement(By.xpath("//*[@class='login']")).click();
	}

	/*@When("^Enter username and password$")
	public void enter_username_and_password() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Reeha@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("5%GV()HH");
	}*/
		
	@When("^Enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_username_and_password(String emailId, String password) throws Throwable {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailId);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
	   
	}

	/*@When("^Enter registered username and password$")
	public void enter_registered_username_and_password(DataTable credentials) throws Throwable {
	 
		List <List <String>> data = credentials.raw();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(data.get(0).get(1));
		
	}*/
	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}

/*	@Then("^user must be login to the webpage$")
	public void user_must_be_login_to_the_webpage() throws Throwable {
		
		 * String captureText = signout.getText(); Assert.assertEquals(true,
		 * captureText.contains("Sign out"));
		 
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		driver.quit();
	}*/
	
	
	
		@Then("^verify login$")
		public void verify_login() throws Throwable {
		//	driver.findElement(By.xpath("//a[@class='logout']")).click();
			driver.quit();
		}

	}

