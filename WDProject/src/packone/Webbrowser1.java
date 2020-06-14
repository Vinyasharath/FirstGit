package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webbrowser1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://facebook.com");
		driver1.manage().window().maximize();
		driver1.findElement(By.id("email")).sendKeys("1002876");
		driver1.findElement(By.id("email")).clear();
		driver1.findElement(By.id("email")).sendKeys("vinnu");
		driver1.findElement(By.id("email")).clear();
		
		WebElement c1=driver1.findElement(By.id("email"));
		c1.sendKeys("sharath");
		c1.clear();
		c1.sendKeys("babu");
		c1.clear();

		WebElement c2=driver1.findElement(By.id("pass"));
		c2.sendKeys("sharath");
		c1.clear();
		c1.sendKeys("babu");
		c1.clear();
	}

}
