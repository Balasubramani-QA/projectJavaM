package projJavaPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoTest5 {

	static WebDriver driver;
	
	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub

		System.getProperty("webdriver.msedge.driver", "D:\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.name("q")).sendKeys("laptop");
		Thread.sleep(5000);

	    List<WebElement> sugglist = driver.findElements(By.xpath("//li[contains(@class,'Y5N33s')]"));
		
	    for (WebElement e : sugglist) {
		System.out.println(e.getText());
	}

	}
}
