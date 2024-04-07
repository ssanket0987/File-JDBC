package file.demos;

public class Travel implements Comparable<Travel> {
	
	private String packageId;
	private String packageSource;
	private String packageDestination;
	private int noOfDays;
	private double packageCost;
	public Travel(String packageId, String packageSource, String packageDestination, int noOfDays, double packageCost) {
		super();
		this.packageId = packageId;
		this.packageSource = packageSource;
		this.packageDestination = packageDestination;
		this.noOfDays = noOfDays;
		this.packageCost = packageCost;
	}
	public String getPackageId() {
		return packageId;
	}
	public String getPackageSource() {
		return packageSource;
	}
	public String getPackageDestination() {
		return packageDestination;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public double getPackageCost() {
		return packageCost;
	}
	
	
	@Override
	public String toString() {
		return "Travel [packageId=" + packageId + ", packageSource=" + packageSource + ", packageDestination="
				+ packageDestination + ", noOfDays=" + noOfDays + ", packageCost=" + packageCost + "]";
	}
	@Override
	public int compareTo(Travel t) {
		if(this.packageCost <t.packageCost)
		{
			return 1;
		}
		return -1;
	}
	
	
	
	

}
