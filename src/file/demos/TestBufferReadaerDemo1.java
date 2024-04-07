package file.demos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferReadaerDemo1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("enter your id");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enetr salary");
		double salary = Double.parseDouble(br.readLine());
		System.out.println("Enetr phone number");
		long ph =Long.parseLong(br.readLine());
		System.out.println("Enter weight");
		float wt = Float.parseFloat(br.readLine());
		System.out.println("You entered:"+name+" "+id+" "+salary+" "+ph+" "+wt);
		
		
	}

}
