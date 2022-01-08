package ExceptionHandling;

import java.io.*;
public class CheckedExceptionHanlding {

	public static void chekcedException() throws IOException{
		System.out.println("Writing content into the file");
		BufferedWriter bw=new BufferedWriter(new FileWriter("src/test/resources/chekced.txt"));
		bw.write("Hello checked exception");
		bw.close();
		System.out.println("File created and written");
	}

	public static void tryCatchException() {
		try {
		System.out.println("Writing content into the file");
		BufferedWriter bw=new BufferedWriter(new FileWriter("src/test/resources/chekced.txt"));
		bw.write("Hello checked exception, second time");
		bw.close();
		System.out.println("File created and written");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
	//throws IOException {
		// TODO Auto-generated method stub
		//chekcedException();
		tryCatchException();
	}

}
