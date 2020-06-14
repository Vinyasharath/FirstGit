package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMethods {
	public WebDriver driver;

	//Method name: launchapp();
	//Description: To Launch the Application
	//Author: Kishore Kumar
	//Reviewed by:Qshore
	//Date:07052020
	//Arguments:
		
	/* public void launchapp()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://reddif.com");
			driver.manage().window().maximize();
		}*/
		
	public void launchapp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void CloseApp()
	{
		driver.close();
	}
	
	

public void elementavalable(String loc, boolean value) {

boolean element= driver.findElement(By.id(loc)).isDisplayed();

if(element==value)
	System.out.println("pass");
else
	System.out.println("fail");
	
}

}
