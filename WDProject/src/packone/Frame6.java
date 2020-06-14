package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame6 {

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://docs.oracle.com/javase/7/docs/api/");
			driver.manage().window().maximize();
			
			
			WebElement f1=driver.findElement(By.name("packageListFrame"));
			WebElement f2=driver.findElement(By.name("packageFrame"));
			//driver.switchTo().frame(f1);
			List<WebElement> links=driver.switchTo().frame(f1).findElements(By.tagName("a"));
			
			int i;int j;
			for( i=1; i<links.size();i++) {
				
			links.get(i).click();
			Thread.sleep(2000);
			driver.switchTo().parentFrame();
			List<WebElement>links2=driver.switchTo().frame(f2).findElements(By.tagName("a"));	
			
			for( j=0; j<links2.size();j++) {
		    System.out.println(links2.get(j).getText());
			}
			System.out.println("-------------------------------------------");
		    driver.switchTo().parentFrame();
		    driver.switchTo().frame(f1);
			
			}
		}

	}


