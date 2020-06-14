package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame5 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		
		WebElement f1=driver.findElement(By.name("packageListFrame"));
		WebElement f2=driver.findElement(By.name("packageFrame"));
		//driver.switchTo().frame(f1);
		List<WebElement> links=driver.switchTo().frame(f1).findElements(By.tagName("a"));
		
		int i;
		for( i=1; i<links.size();i++) {
			
		links.get(i).click();
		Thread.sleep(4000);
		driver.switchTo().parentFrame();
		List<WebElement>links2=driver.switchTo().frame(f2).findElements(By.tagName("a"));	
	    System.out.println(links2.size());
	    driver.switchTo().parentFrame();
	    driver.switchTo().frame(f1);
		
		}
	}

}
