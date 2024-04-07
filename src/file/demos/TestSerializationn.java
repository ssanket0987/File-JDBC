package file.demos;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerializationn {
	public static void main(String args[])throws IOException{
		//fileoutputstream () throws  filenotfoundexception
		FileOutputStream fout=new FileOutputStream("D:/csj35Ser.txt");
		//objectoutputstream() throws ioexception
		ObjectOutputStream out=new ObjectOutputStream(fout);
		//creating object of account class
		Account accountObj=new Account(1234,6789,"ABC");
		//writing the state of the object into bytes stream
		//void writeobject (object obj) throws ioexception
		out.writeObject(accountObj);
		fout.close();
		out.close();
		System.out.println("Data has been serializationnn");

}
}
