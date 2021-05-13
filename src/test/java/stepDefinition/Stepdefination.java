package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination {
	
    WebDriver Driver;
    public static WebDriver driver;
    
    String userName = "test";
	String password = "test";
	String url = "http://demo.guru99.com/test/newtours/";
    
    @Given("Initialize the Chrome browser and launch the Opencart Website")
    public void initialize_the_chrome_browser_and_launch_the_opencart_website() throws Exception {
    	

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\malik\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();
    }  
        @When("User enters Username")
        public void user_enters_username() {    
        driver.get(url);
		
		driver.findElement(By.name("userName")).sendKeys(userName);
		
        }
        @And("User enters Password")
        public void user_enters_password() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        }
        @Then("click on Login")
        public void click_on_login() {
			driver.findElement(By.xpath("//input[@name='submit']")).click();
        	
			/*
			 * String expectedTitle = "Login: Mercury Tours"; String actualTitle = "";
			 * 
			 * actualTitle = driver.getTitle(); System.out.println(actualTitle);
			 */
       
			/*
			 * if (actualTitle.contentEquals(expectedTitle)){
			 * System.out.println("Test Passed!"); } else {
			 * System.out.println("Test Failed"); }
			 */
	       
	        //close 
	       // driver.close();

    }
}