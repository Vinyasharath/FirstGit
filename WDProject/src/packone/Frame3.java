package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		List<WebElement>frms=driver.findElements(By.tagName("frame"));
		
		int i; int j;
		
		for(i=0; i<frms.size();i++) {
		
			List<WebElement>links=driver.switchTo().frame(i).findElements(By.tagName("a"));
			for(j=0; j<links.size();j++) {
			System.out.println(links.get(j).getText());		
		
		}
		
		System.out.println("------------------------------");
		driver.switchTo().parentFrame();
		
	}
	}
}
