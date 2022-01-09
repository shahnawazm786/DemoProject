package Misc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FinalExampleFinally {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedWriter bw=null;// reference
		try {
			System.out.println("Start writing into a file");
			
		 bw=new BufferedWriter(new FileWriter("src/main/resources/Text/09jan2022.txt"));
		bw.write("Hello");
		bw.write("Java", 0, 4);
		bw.append("India");
		bw.write("Hello");
		bw.write("Java", 0, 4);
		bw.append("India");
		System.out.println("End of the file writing");
		}catch(IOException ioe) {
			System.out.println("Error Occured - Path not found");
			ioe.printStackTrace();
		}
		finally
		{
			
			bw.close();
			System.out.println("Finally Block Executed");
		}
		
	}

}
