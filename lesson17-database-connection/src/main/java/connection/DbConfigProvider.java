package connection;

import java.io.InputStream;
import java.util.Properties;

public class DbConfigProvider {
    private DbConfigProvider() {

    }

    public static Properties getProps() {
        Properties props = new Properties();

        try {
            InputStream inputStream = ClassLoader.getSystemResourceAsStream("db-config.properties");
            props.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return props;
    }
}
