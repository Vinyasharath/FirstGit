package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserVal3 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://facebook.com");
			driver.manage().window().maximize();

			
			driver.navigate().refresh();
			driver.navigate().back();
			driver.navigate().forward();
			driver.manage().window().maximize();
			driver.manage().window().getSize();
			driver.manage().window().getPosition();
			driver.manage().window().fullscreen();
	}

}
