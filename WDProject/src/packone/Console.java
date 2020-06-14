package packone;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter A value");
		
		int a=s.nextInt();
		
		System.out.println("Enter B value");
		
		int b=s.nextInt();
		
		System.out.println(a*b);
		
		System.out.println("Enter URL");
		
		String u=s.next();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(u);
		driver.manage().window().maximize();
		
		System.out.println("Enter Mail Id");
		
		String e=s.next();
		
		driver.findElement(By.id("email")).sendKeys(e);
		
		System.out.println("Enter Password");
		
		String p=s.next();
		
		driver.findElement(By.id("pass")).sendKeys(p);
		
		
	}

}
