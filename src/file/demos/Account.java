package file.demos;

import java.io.Serializable;

public class Account implements Serializable {

	
	private long acnNumber;
	private int pinCodeNumber;
	private String  accountHolderName;
	

	public Account(long acnNumber, int pinCodeNumber, String accountHolderName) {
		super();
		this.acnNumber = acnNumber;
		this.pinCodeNumber = pinCodeNumber;
		this.accountHolderName = accountHolderName;
	}
	public long getAcnNumber() {
		return acnNumber;
	}
	
	public int getPinCodeNumber() {
		return pinCodeNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	@Override
	public String toString() {
		return "Account [acnNumber=" + acnNumber + ", pinCodeNumber=" + pinCodeNumber + ", accountHolderName="
				+ accountHolderName + "]";
	}
	
}