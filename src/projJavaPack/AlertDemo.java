package projJavaPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.msedge.driver", "D:\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/p[2]/a")).click();
		Alert ale = (Alert)driver.switchTo().alert();
		
		
		System.out.println("Alert message: "+ale);
		                                 
	}

}
