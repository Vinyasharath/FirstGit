package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebConditions {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://ultimatix.com");
			driver.manage().window().maximize();
		
			List<WebElement>s1=driver.findElements(By.tagName("a"));  
			int i;
			for( i=0;i<s1.size();i++)	{
				String b1 = s1.get(i).getText();
			if(b1.startsWith("G")==true)
				System.out.println(b1);		
	}
		}
}


