package file.demos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer implements Serializable
{
	
	private static String customerName;
	private long cutomerCode;
	public  String getCustomerName() {
		return customerName;
	}
	public  void setCustomerName(String customerName) {
		customerName= customerName;	}
	public long getCutomerCode() {
		return cutomerCode;
	}
	public void setCutomerCode(long cutomerCode) {
		this.cutomerCode = cutomerCode;
	}
}
	

