package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TestConnexionJdbc {
	
	public static void main(String[] args) throws SQLException {

		ResourceBundle props = ResourceBundle.getBundle("database");
		String url = props.getString("jdbc.db.url");
		String user = props.getString("jdbc.db.user");
		String pwd = props.getString("jdbc.db.pwd");
		
		Connection connection = DriverManager.getConnection(url, user, pwd);
		System.out.println(connection);
		connection.close();

	}

}
