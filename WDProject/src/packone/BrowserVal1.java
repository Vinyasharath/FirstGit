package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserVal1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://facebook.com");
		driver1.manage().window().maximize();
		driver1.findElement(By.id("email")).sendKeys("1002876");
		
		boolean a=driver1.findElement(By.id("email")).isDisplayed();
		if(a==true)
System.out.println("pass");
		else
			System.out.println("fail");
		boolean b=driver1.findElement(By.id("pass")).isEnabled();
		if(b==true)
System.out.println("enabled");
		else
			System.out.println("disabled");
		String c = driver1.findElement(By.id("email")).getAttribute("class");
		System.out.println(c);
		String d = driver1.findElement(By.id("pass")).getAttribute("type");
		System.out.println(d);
		System.out.println(driver1.findElement(By.id("email")).getLocation());
		System.out.println(driver1.findElement(By.id("email")).getTagName());
		System.out.println(driver1.findElement(By.id("email")).getSize());
	}

}
