package stepdefinitions.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class MyranConfiguration {

    public static MyranConfig getBaseConfiguration() throws IOException {
        Properties props = loadProperties();
        return new MyranConfig(
                props.getProperty("myran.auth.baseUrl"),
                props.getProperty("myran.auth.username"),
                props.getProperty("myran.auth.password"),
                props.getProperty("myran.auth.grantType"),
                props.getProperty("myran.auth.clientId")
        );
    }

    public static Properties loadProperties() throws IOException {
        Properties configuration = new Properties();
        InputStream inputStream = MyranConfiguration.class
                .getClassLoader()
                .getResourceAsStream("application.properties");
        configuration.load(inputStream);
        inputStream.close();
        return configuration;
    }
}
