package file.demos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TravelUtility {

	/*
	 * method should read lines by lines data from travelpacakeg.txt file
	 * It parse the data based on the attribute of travel class
	 * It construct Travel object and set values to all attributes
	 * add travel objects to treeset object
	 * the returns that TreeSet Object
	 * 
	 * 
	 * 
	 */
	
	public Set<Travel> generatesTravelObject(File file)
	{
		Set< Travel> setOfObjects=new TreeSet();
		
		
		try
		{
			//constructing object of FileReadder 
			FileReader reader = new FileReader(file);
			// constructing object of the BufferReader to read line by line data  efficiently
			
			BufferedReader br = new BufferedReader (reader);
			String line = null;
			while((line=br.readLine())!=null)
			{
				//System.out.println(line);
				//String[] split (String regex)
				//Splitting string based on comma and getting the array of string 
				
				String[] str=line.split(",");
				//System.out.println(str);
				//System.out.println(Arrays.toString(str));
				
				//System.out.println(str[0]+ " "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]);
				
				String pacakageId=str[0];
				String packSource=str[1];
				String packDest=str[2];
				int nod =Integer.parseInt(str[3]);
				double cost=Double.parseDouble(str[4]);
				
				//constructing obj of Travel class
				Travel t = new Travel(pacakageId,packSource,packDest,nod,cost);
				//adding with Treeset Object
				setOfObjects.add(t);
				
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return setOfObjects;
	}
	
	
	
}
