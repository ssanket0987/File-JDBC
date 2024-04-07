package file.demos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;


public class TestInputFileDemo {
	
	public static void main (String []args)throws IOException
	{
		//OutputStream output = new FileOutputStream
		
		File file = new File ("F://csj35-36.png");
		
		System.out.println(file.canExecute());//boolean canExecute()
		System.out.println(file.canRead());//boolean canRead()
		System.out.println(file.canWrite());//boolean canWrite()
		System.out.println(file.exists());//boolean exists()
		//boolean delete();
		//file.delete();
		
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getFreeSpace());
		//boolean mkdir()
		file.mkdir();
		
		
		
		
		
		FileOutputStream fout= new FileOutputStream(file);
		
		System.out.println("Image File is created");
		//we want read a image file content and copy  into newly created file
		
		InputStream input = new  FileInputStream ("F://cartoon2 (1).jpg");
		//InputStream class provides a method called int read()
		//int read()throws IOException
		
		int b=0;
		while((b=input.read())!=-1)
		{
			fout.write(b);
			
		}
		System.out.println("check your file");
	}

}
