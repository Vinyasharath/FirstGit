package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
WebDriver driver1=new ChromeDriver();
driver1.get("https://auth.ultimatix.net/utxLogin/login?TYPE=33554432&REALMOID=06-000e128c-664b-1c1a-9ba7-abcac0a8f081&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-EdbHMX6T%2bWb8DN7DVmL5sbY%2bn%2b30S7n%2fgIBptYa9dLbudResX4AYm9ObPeNozoDH&TARGET=-SM-HTTPS%3a%2f%2fwww%2eultimatix%2enet%2futxHomeApp%2fredirectToHome%3fTARGET%3dhttps-%3A-%2F-%2Fwww%2eultimatix%2enet-%2Fcontent-%2FultimatixPortal-%2Fultimatixportalhome%2ehtml");
driver1.manage().window().maximize();
driver1.findElement(By.name("form1")).sendKeys("1002876");
driver1.findElement(By.id("proceed-button")).click();

		
	}

}
