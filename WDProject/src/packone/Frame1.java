package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();

		//Create Webelement for frame1
		WebElement f1=driver.findElement(By.name("packageListFrame"));
		
		//click on link in frame
		driver.switchTo().frame(f1).findElement(By.xpath("/html/body/div[2]/ul/li[2]/a")).click();
		
		//Navigate back to the parent frame
		driver.switchTo().parentFrame();
		
		//Create Webelement for frame2
		WebElement f2=driver.findElement(By.name("packageFrame"));
		
		//click on link in frame
		driver.switchTo().frame(f2).findElement(By.xpath("/html/body/div/ul[1]/li[5]/a/i")).click();
	}

}
