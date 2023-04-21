package commjspbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/javabatch";// url connect
		String username ="root";
		String password ="T#9758@qlph";
		String sql = "INSERT INTO car VALUES (3,'abc')";
		// To establish connection
		Connection connection = null;
		try {
			// load/register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");// Driver connet

			connection = DriverManager.getConnection(url, username, password);
			// To create statement
			Statement statement = connection.createStatement();
			// To execute the statement
			statement.execute(sql);
			System.out.println("All good");

//	    //To close the connection

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("connection closed");
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 1.insert
	// 2.delete
	// 3.update
	// 4.getAll
	// 5.getById

}
