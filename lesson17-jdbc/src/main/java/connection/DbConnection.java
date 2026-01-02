package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

	private static Connection connection;
	public DbConnection() {
		// TODO Auto-generated constructor stub
	}
	public static Connection getConnection() {
		if (connection == null) {
			Properties props = DbProvider.getProperties();
			
			try {
				Class.forName(props.getProperty("MYSQL_DRIVER"));
				connection = DriverManager.getConnection(
						props.getProperty("DB_CONFIG_URL"), 
						props.getProperty("DB_USER"), 
						props.getProperty("DB_PASS")
				);
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}
