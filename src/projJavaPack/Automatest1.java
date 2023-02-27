package projJavaPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Automatest1 {

	private WebDriver driver;
	 private String baseUrl;
	
	 

	public void setitup() throws Exception {
		// Selenium version 3 beta releases require system property set up
		//System.setProperty("webdriver.gecko.driver", "D:\\driver\\geckodriver.exe");
		System.getProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		// Create a new instance for the class FirefoxDriver
		// that implements WebDriver interface
		driver = new FirefoxDriver();
		// Implicit wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Assign the URL to be invoked to a String variable
		// baseUrl = "https://chandanachaitanya.github.io/selenium-practice-site/";
		baseUrl = "file:///E:/Chandu/My%20Blog/githubDemoSite/index.html";
	}

	
	public void testPageTitle() throws Exception {
		// Open baseUrl in Firefox browser window
		
		driver.get(baseUrl);
			
		// Locate 'Programming Languages' dropdown using id
		WebElement languagesDD = driver.findElement(By.id("programming-languages"));
		// Create an instance of 'Select' class by passing the dropdown web element
		Select languages = new Select(languagesDD);
		// Select 'JavaScript' language by its visible text
		languages.selectByVisibleText("JavaScript");
		// Prints the selected option to console
		System.out.println("Selected programming language is: " + languages.getFirstSelectedOption().getText());
		// Check if languages dropdown supports multiple selection and print the result to console
		if(languages.isMultiple()){
			System.out.println("Languages dropdown supports multiple selection");
		}else {
			System.out.println("Languages dropdown does not support multiple selection");
		}

		// Locate multi select element using name
		WebElement toolSuite = driver.findElement(By.name("selenium_suite"));
		// Create an instance of 'Select' class by passing the multi select element
		Select multiSelect = new Select(toolSuite);
		// Select 'Selenium RC' by its value
		multiSelect.selectByValue("RC");
		// Select 'Advantages' by its value
		multiSelect.selectByValue("Adv");
		// De-select 'Selenium RC' by its index
		multiSelect.deselectByIndex(2);
		// Select "Selenium WebDriver" by its visible text
		multiSelect.selectByVisibleText("Selenium WebDriver");
		// Get all selected options in a list
		List<WebElement> suiteItems = multiSelect.getAllSelectedOptions();
		// Prints all selected options
		System.out.println("Options selected  under 'Selenium Tool Suite' are:");
		for (WebElement option : suiteItems) {
			System.out.println(option.getText());
		}
		
	} // End of @Test

	public void tearDown() throws Exception {
		// Close the Firefox browser
		driver.close();
	}
	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		
		Automatest1 at =new Automatest1();
		at.setitup();
		at.testPageTitle();
		at.tearDown();
	
}

}