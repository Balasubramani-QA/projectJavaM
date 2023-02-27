package projJavaPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Autotest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.msedge.driver", "D:\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
	    //driver.manage().window().maximize();
	    driver.navigate().refresh();
	    driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		//List <WebElement> links =driver.findElements(By.tagName("a"));
		List <WebElement> links = driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']/descendant::div[@role='button']"));
		
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());               
		}
	}

}
