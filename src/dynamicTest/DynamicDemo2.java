package dynamicTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDemo2 {
  
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String CurrentPopulation = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		String todays = "//div[@class='label-counter']/parent::div//span[@class='rts-counter']";
		
		
		System.getProperty("webdrive.chrome.driver", "D:\\driver\\chromedriver.exe");
	//	WebDriverManager.chromedriver.setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
	    driver.manage().window().maximize();
		
	   // printPopulationdata(CurrentPopulation);
	    printPopulationdata(todays);
}
	public static void printPopulationdata(String todays) {
		 while (true) {	    
			    List <WebElement> wb = driver.findElements(By.xpath(todays));
			    
			    for (WebElement e : wb) {
			    	System.out.println(e.getText());
			    	
			    }
		}
		
		
	}
	}
	