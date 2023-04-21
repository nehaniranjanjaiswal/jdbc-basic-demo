package commjspbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestGetById {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/javabatch";
	String username="root";
    String password="T#9758@qlph";
    String sql="SELECT * FROM  car where id=2";
    Connection connection=null;
    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 connection=DriverManager.getConnection(url,username,password);
		Statement statement=connection.createStatement();
		ResultSet resultset=statement.executeQuery(sql);
		while(resultset.next()) {
			System.out.println(resultset.getInt(1));
			System.out.println(resultset.getString(2));
			System.out.println("=============================");
}
}
    catch (ClassNotFoundException e) {
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
