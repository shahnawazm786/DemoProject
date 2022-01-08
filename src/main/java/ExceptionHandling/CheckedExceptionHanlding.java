package ExceptionHandling;

import java.io.*;
public class CheckedExceptionHanlding {

	public static void chekcedException() throws IOException{
		BufferedWriter bw=new BufferedWriter(new FileWriter("src/test/resources/chekced.txt"));
		bw.write("Hello checked exception");
		bw.close();
	}

	public static void tryCatchException() {
		try {
		BufferedWriter bw=new BufferedWriter(new FileWriter("src/test/resources/chekced.txt"));
		bw.write("Hello checked exception");
		bw.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		chekcedException();
	}

}
