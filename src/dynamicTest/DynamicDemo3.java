package dynamicTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.getProperty("webdrive.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
	    driver.manage().window().maximize();
		
	    while (true) {	    
	    List <WebElement> wb = driver.findElements(By.xpath("//div[@class='label-counter']/parent::div//span[@class='rts-counter']"));
	    
	    for (WebElement e : wb) {
	    	System.out.println(e.getText());
	    	// System.out.println(e.getSize());
	}

}
		
		
	}

}
