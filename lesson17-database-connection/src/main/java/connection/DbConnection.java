package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	private static Connection connection;
	
	private DbConnection() {
	}
	
	public static Connection getConnection() {
		if (connection == null) {
			final var props = DbConfigProvider.getProps();
			try {
				connection = DriverManager.getConnection(
						props.getProperty("url"), 
						props.getProperty("user"), 
						props.getProperty("password")
				);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
	
}
