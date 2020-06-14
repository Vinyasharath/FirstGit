package packone;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_POI {


			public static void main(String[] args) throws Exception {
				
				FileInputStream f1 = new FileInputStream("C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\XLPOI.xlsx"); 
				
				XSSFWorkbook wb=new XSSFWorkbook(f1); 		
				
				XSSFSheet s=wb.getSheet("Sheet1"); 
				
				
			
			
				
				System.out.println(s.getRow(0).getCell(0).getStringCellValue());
				System.out.println(s.getRow(0).getCell(1).getStringCellValue());
				System.out.println(s.getRow(1).getCell(0).getStringCellValue());
				System.out.println(s.getRow(1).getCell(1).getStringCellValue());
				System.out.println(s.getRow(2).getCell(0).getStringCellValue());
			}	

	}


