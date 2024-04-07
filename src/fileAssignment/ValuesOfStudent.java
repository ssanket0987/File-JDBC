package fileAssignment;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;


public class ValuesOfStudent {

	public static void main(String args[]) throws IOException {
		
	
		Student s1= new Student(21,"Sanket","Python");
		Student s2= new Student(22,"Aniket","java");
		Student s3= new Student(23,"Ankit","Python");
		
		List<Student> list=new ArrayList();
		
		
		
		
		
	try {
		OutputStream output= new FileOutputStream("F://StudentDetails.txt");
		
		System.out.println("file is created at F://Drive");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		for(Student s: list)
		{
			String name=String.valueOf(s.name);
			byte[] arrayofname=name.getBytes();
			output.write(arrayofname);
			output.write(",".getBytes());
			
			String roll=String.valueOf(s.roll);
			byte[] arrayofroll=roll.getBytes();
			output.write(arrayofroll);
			output.write(",".getBytes());
	        
			String course=String.valueOf(s.course);
			byte[] arrayofcourse=course.getBytes();
			output.write(arrayofcourse);
			output.write(".".getBytes());
			
			output.write("\n".getBytes());
			
		}
		
		
	} catch (FileNotFoundException e) {
		
	
		
		e.printStackTrace();
	}	
}
}