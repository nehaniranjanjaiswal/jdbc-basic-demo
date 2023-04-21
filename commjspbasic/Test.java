package commjspbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Test {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/javabatch";
	String username="root";
    String password="root";
    String sql="insert into car values(1,'thar','abc')";
    Connection connection=null;
    try {
    	 //to load driver
		Class.forName("com.mysql.cj.Driver");
		//to establish connection
		 connection=DriverManager.getConnection(url,username,password);
		//create statement
	    Statement statement=connection.createStatement();
	   
		//execute statement
	    statement.execute(sql);
	    
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    finally {
    	System.out.println("connection closed");
    	try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
}
