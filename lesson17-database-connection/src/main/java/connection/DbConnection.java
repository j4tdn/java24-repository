package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    private static Connection connection;

    private DbConnection() {
    }

    public static Connection getConnection() {
        if (connection == null) {
            final var props = DbConfigProvider.getProps();
            try {
                Class.forName(props.getProperty("driver"));

                connection = DriverManager.getConnection(
                        props.getProperty("url"),
                        props.getProperty("user"),
                        props.getProperty("password"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return connection;
    }
}
