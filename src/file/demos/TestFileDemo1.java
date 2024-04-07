package file.demos;

import java.io.OutputStream;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileDemo1 {

	public static void main(String[] args) {
		
		try {
		OutputStream output= new FileOutputStream("F://CSJ35-36.txt");
		
		//for saving file in the project ("./src/csj35-36.txt");
		System.out.println("file is created at D://Drive");
		
		Scanner sc = new Scanner (System.in);
		/*System.out.println("Enter Your Message");
		String msg = sc.nextLine();
		//void write(byte[] b);
		//void write(byte b);
		//byte[] get Bytes();
		//byte[] bytes="ABC".getBytes();
		//System.out.println(Arrays.to String(bytes));
		
		byte[] bytes= msg.getBytes();
		output.write(bytes);
		System.out.println("File Written Succesfully");*/

		System.out.println("Enter Employee id");
		int empId=sc.nextInt();
		/*
		 * toString() :This method is the method of Object class 
		 * This method convert any valid object type into String ]
		 * 
		 * Static String valueOf(int a): This method convert any primitive type into String
		 * 
		 */
		
		String id =String.valueOf(empId);
		//Converting string to byte array 
		byte[] arrayOfId= id.getBytes();
		//writing empId to file output stream object
		output.write(arrayOfId);
		//Writing "," to output  stream Object
		output.write(",".getBytes());
		sc.nextLine();
		System.out.println("Enter Employee Name");
		String empName=sc.nextLine();
		byte[] arrayOfName= empName.getBytes();
			output.write(arrayOfName);
			output.write(",".getBytes());
			
			System.out.println("Enetr Employee Salary");
			double salary = sc.nextDouble();
			//convertinhg double into string
		String sal=String.valueOf(salary);
		//converting string byte array
		byte[] arrayOfSalary=sal.getBytes();
		output.write(arrayOfSalary);
		output.write("\n".getBytes());
		System.out.println("emp information saved to file");
		}
		catch(IOException e){
			System.out.println(e);
		}
	}

}


