package packone;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("privacy-link")).click();
		driver.findElement(By.id("cookie-use-link")).click();
		
          Set<String> a=driver.getWindowHandles();
          ArrayList b=new ArrayList(a);
          
          /*System.out.println(b.get(0));
          System.out.println(b.get(1));
          System.out.println(b.get(2));
          for(int i=0; i<b.size(); i++) {  
          System.out.println(b.get(i));*/

              for(int i=0; i<b.size(); i++) {
        	  List<WebElement> link=driver.switchTo().window((String)b.get(i)).findElements(By.tagName("a"));   	  
        	  System.out.println(link.size());
        	  driver.switchTo().window((String)b.get(i)).close();
          
	}

}}
