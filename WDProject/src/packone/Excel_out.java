package packone;

//import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.IOException;

//import jxl.LabelCell;
//import jxl.Sheet;
import jxl.Workbook;
//import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel_out {

	public static void main(String[] args) throws Exception {
		
		//Identify the location to create the excel file
		
FileOutputStream fo = new FileOutputStream("C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\0510.xls");
		
		//Create excel file
		
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		
		//Create sheet in created file sheet name as Results1 and sheet first position is zero
		
		WritableSheet w1=wwb.createSheet("Results1", 0);
		WritableSheet w2=wwb.createSheet("Results2", 0); 
		
		int a=300;
		int b=80;
		int c=a*b;
		int d=a-b;
		
	//Creating cell -Label+Control+space
		
		Label a1 = new Label(0,0,"value is " +c);
		Label b1 = new Label(10,11,"value is " +d);

		//Add cell into sheet which is created above
		
		w1.addCell(a1);
		w2.addCell(b1);
		
		//Save the sheet
		
		wwb.write();
		
		//close the sheet
		
		wwb.close();
	}

}
