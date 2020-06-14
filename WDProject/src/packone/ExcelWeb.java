package packone;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class ExcelWeb {

	
		public static void main(String[] args) throws Exception {
			
			 //Identify the location of excel
			
			FileInputStream file_obj = new FileInputStream("C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\0509.xls");
			
			//Open Identified Excel
			
			Workbook workbook_obj=Workbook.getWorkbook(file_obj);
			
			//open sheet
			
			Sheet sheet_obj=workbook_obj.getSheet("Sheet1");
			
			//Identify the cell in the sheet
			
			System.out.println(sheet_obj.getCell(0,0).getContents());
			System.out.println(sheet_obj.getCell(1,0).getContents());
			System.out.println(sheet_obj.getCell(2,0).getContents());
			System.out.println(sheet_obj.getCell("d1").getContents());
			System.out.println(sheet_obj.getCell("e1").getContents());
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\Jars\\chromedriver.exe");
			WebDriver driver1=new ChromeDriver();
			driver1.get(sheet_obj.getCell("a1").getContents());
			driver1.manage().window().maximize();
			driver1.findElement(By.id(sheet_obj.getCell("b1").getContents())).sendKeys(sheet_obj.getCell("c1").getContents());
			driver1.findElement(By.id(sheet_obj.getCell("d1").getContents())).sendKeys(sheet_obj.getCell("e1").getContents());
	}

}
