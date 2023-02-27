package projJavaPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoTest6 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.getProperty("webdriver.msedge.driver", "D:\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://signup.microsoft.com/get-started/signup?products=35dffc92-9eb4-4d5c-82c2-2582b37bb9c4&mproducts=CFQ7TTC0LDPB:0005&fmproducts=CFQ7TTC0LDPB:0005&culture=en-us&country=US&ali=1");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@data-bi-id='Email']")).sendKeys("balasubramani.n@mithrahsoft.com");
		driver.findElement(By.xpath("//span[@class='ms-Button-label label-413']")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"id__20\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Dropdown42-option\"]")).click();
		List<WebElement> sugglist = driver.findElements(By.xpath("//div[@class='ms-Callout-main calloutMain-503']"));
		Thread.sleep(5000);

/*	    List<WebElement> sugglist = driver.findElements(By.xpath("//li[contains(@class,'Y5N33s')]"));              */
		
	    for (WebElement e : sugglist) {
		System.out.println(e.getText()); 
		System.out.println(sugglist.size());
		for(int i=0;i<sugglist.size();i++) {
			System.out.println(sugglist.get(i).getText().length());
			System.out.println(sugglist.get(i).getText());
		}
		
	}
	}
}


