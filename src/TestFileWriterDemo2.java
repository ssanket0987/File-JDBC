

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileWriterDemo2 {

	public static void main(String[] args)  {
		
		try(FileWriter writer= new FileWriter("./src/CSJ35Textt1.txt");)
		
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the cousre name ");
			String cname = sc.next();
			writer.write(cname);
			writer.write(",");
			System.out.println("Enter the Course price");
			double price = sc.nextDouble();
			//converting double into string
			String cPrice = String.valueOf(price);
			writer.write(cPrice);
			writer.write(",");
			System.out.println("Enter Course duration");
			int duration = sc.nextInt();
			String cDuration=String.valueOf(duration);
			writer.write(cDuration);
			
			writer.write("\n");
			
			System.out.println("Course saved into the file");
	}catch(IOException e) {
			System.out.println(e.getMessage());
		}
					
	}

}
