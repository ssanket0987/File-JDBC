package file.demos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
public class TestFileWriterDemo1 {

	public static void main(String[] args) throws IOException {
		

			File file = new File("./src/csj35Tesxt1.txt");
			
			Writer writer = new FileWriter(file);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("eneter your Message:");
			
			String msg= sc.nextLine();
			writer.write(msg);
			writer.close();
			System.out.println("File Written Succesfully");
					
	}

}
