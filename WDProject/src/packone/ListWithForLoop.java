package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWithForLoop {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://rediff.com");
			driver.manage().window().maximize();
			
			List<WebElement>c1=driver.findElements(By.tagName("a"));   
			for(int i=0;i<10;i++)   //for(int i=0;i<c1.size();i++)	for all elements
				//System.out.println(c1.get(i).getText());
		System.out.println((c1.get(i).getText() + "-" + c1.get(i).getAttribute("href")));		
	}

}
