package packone;


import java.io.BufferedWriter;

import java.io.FileWriter;

public class Note_out {

	public static void main(String[] args) throws Exception {
		
		
FileWriter fr = new FileWriter("C:\\Users\\sharathbabu.m01\\Desktop\\Webdriver\\0512.txt");

BufferedWriter b = new BufferedWriter(fr);

b.write("My Name is sharath");

b.newLine();

b.write("My Name is Vinnu");

b.close();
	
		}


	}


