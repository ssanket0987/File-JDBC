package file.demos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileWriterDemo2 {

	public static void main(String[] args)  {
		
		try(FileWriter wrt= new FileWriter("./src/csj364.txt");)
		
		{
			
			char[] ch= {'G','o','o','d'};//  good 
			wrt.write(ch);
			
			String msg="cyber success";  // c y b e r   S u c cess
			char[] ch2=msg.toCharArray();// 0 1 2 3 4 5 6 7 8 9
			wrt.write(ch2,2,5);
			
			
			System.out.println("Check your file");
			
	}catch(IOException e) {
			System.out.println("Problem in the file");
		}
					
	}

}
