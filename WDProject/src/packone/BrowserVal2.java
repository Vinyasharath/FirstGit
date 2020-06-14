package packone;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserVal2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		String a= driver.getTitle();
		System.out.println(a);
		
		if(a.startsWith("k")==true)
			System.out.println("pass");
		else
			System.out.println("fail");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getPageSource());
			System.out.println(driver.getWindowHandle());

	}

}
