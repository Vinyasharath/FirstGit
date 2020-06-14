package packone;

import java.io.BufferedReader;
//import java.io.FileOutputStream;
import java.io.FileReader;

public class Note_input {


		
		public static void main(String[] args) throws Exception {
			
			//Identify the location to create the excel file
			
	FileReader fr = new FileReader("C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\0511.txt");
	
	BufferedReader b1 = new BufferedReader(fr);
	//System.out.println(b1.readLine());only for first line
	String a1;
	while((a1=b1.readLine())!=null)//for multiple lines
			{
		System.out.println(a1);//
			}
	

	}

}
