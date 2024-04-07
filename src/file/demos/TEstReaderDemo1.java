package file.demos;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TEstReaderDemo1 {

	public static void main(String[] args) throws IOException {
		
		//FileReader(String fileName) throws FileNotFoundException
		Reader reader = new FileReader("./src/CSJ35textt1.txt");
		int k=0;
		//int read() throws IoException
		while((k = reader.read())!=-1)
		{
			System.out.print((char)k);
		}
{
	
}
		
		

	}

}
