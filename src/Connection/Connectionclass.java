package Connection;
import java.sql.*;
public class Connectionclass {

	//Added by Rohit
	private static Connection con=null;
	private static String url=null;
	private static String username=null;
	private static String password=null;
	
	public static Connection getConnection() 
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	   
			   url="jdbc:mysql://localhost:3306/Employee";
			   username="root";
			   password="Rohit@1234";
			   con=DriverManager.getConnection(url,username,password);
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return con;
	}
	

}
