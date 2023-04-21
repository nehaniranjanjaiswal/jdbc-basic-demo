package commjspbasic;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/javabatch";
	String username="root";
	String password="root";
	String sql="INSERT INTO car VALUES(1,'NEHA','ABC')";
	
	try {
		//load /register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//to establish connection
		Connection connection=DriverManager.getConnection(url,username,password);
		//to create an statement
		Statement statement=connection.createStatement();
		//to execute statement
		statement.execute(sql);
		//TO close connection
		connection.close();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
}
}
