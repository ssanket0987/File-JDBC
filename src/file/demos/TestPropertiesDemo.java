package file.demos;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestPropertiesDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		
		FileReader reader = new FileReader("./src/dbconfig.properties");
		Properties p = new Properties();
	
		//void load (reader readerObject)throws IoException
		//void load(InputStream obj)throws IOException
		
	
		p.load(reader);
		String driverName=p.getProperty("driver");
		String url=p.getProperty("url");
		String un=p.getProperty("username");
		String pw=p.getProperty("password");
		System.out.println(driverName+ " "+url+ " "+un+ " "+pw);
		
		Class.forName(driverName);
		Connection con =DriverManager.getConnection(url,un,pw);
		System.out.println("Connection established");
	}

}
