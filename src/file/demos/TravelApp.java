package file.demos;

import java.io.File;
import java.util.Set;
import java.util.function.Consumer;

public class TravelApp {
	
	public static void main(String args[]) {
		
		//creating instance of TravelUtility
		TravelUtility utility = new TravelUtility();
		//creating instance of file which we want to read
		File fileObj=new File("./src/TravelPackage.txt");
		Set <Travel> setOfTravels= utility.generatesTravelObject(fileObj);
		//System.out.println(setOfTravels);
		
		Consumer<Travel> con =(p)->System.out.println(p);
		setOfTravels.forEach(con);
	}

}
