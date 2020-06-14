package packone;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class ExcelForloops {

	public static void main(String[] args) throws Exception {
		
		 //Identify the location of excel
		
		FileInputStream file_obj = new FileInputStream("C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\0509.xls");
		
		//Open Identified Excel
		
		Workbook workbook_obj=Workbook.getWorkbook(file_obj);
		
		//open sheet
		
		Sheet sheet_obj=workbook_obj.getSheet("Sheet1");
		
		//Identify the cell in the sheet
		
		
		
		/*int cc=sheet_obj.getColumns();
		
		for (int i=0; i<cc; i++)
		{
			
			System.out.println(sheet_obj.getCell(i,0).getContents());
		}
		
		int rc=sheet_obj.getRows();
		
		for (int i=0; i<rc; i++)
		{
			
			System.out.println(sheet_obj.getCell(0,i).getContents());
		}*/
		
		int cc=sheet_obj.getColumns();
		int rc=sheet_obj.getRows();
		for (int i=0; i<cc; i++)
		{
			for (int j=0; j<rc; j++)
			{
				//System.out.println(sheet_obj.getCell(i,j).getContents());	
				String value = sheet_obj.getCell(i,j).getContents();
				if(value.equals("Sathi")==true)
				 System.out.println(i + "_" + j);	
				
			}
		}

	}

}
