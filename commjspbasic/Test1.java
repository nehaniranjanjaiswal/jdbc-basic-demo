package commjspbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Test1 {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/javabatch";
	String username="root";
    String password="T#9758@qlph";
    String sql="update car set name='maruti' where id =2";
    Connection connection=null;
    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(url,username,password);
		Statement statement=connection.createStatement();
		int a=statement.executeUpdate(sql);
		if(a>0) {
			System.out.println("update ");
		}
	} catch (ClassNotFoundException e) {
	       e.printStackTrace();
	} catch (SQLException e) {
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
