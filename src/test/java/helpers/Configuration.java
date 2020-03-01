package helpers;

import java.io.IOException;
import java.util.Properties;

public class Configuration {
    public static final String SITE_ADDRESS = "test.site.url";
    public static final String DRIVER_LOCATION = "driver.location";
    public static final String LOGIN = "login";
    public static final String PASSWORD = "password";
    private static Configuration configuration;
    private Properties properties;

    public Configuration() {
        try {
            properties = new Properties();
            properties.load(Configuration.class.getClassLoader().getResourceAsStream("configuration.properties"));
            properties.load(Configuration.class.getClassLoader().getResourceAsStream("configuration_data.properties"));
        } catch (
                IOException exception) {
            throw new ExceptionInInitializerError(exception);
        }
    }

    private String extractProperty(String propertyName) {
        String property = System.getProperty(propertyName);
        if (property == null) {
            property = properties.getProperty(propertyName);
        }
        return property;
    }

    public static Configuration getConfiguration() {
        if (configuration == null) {
            configuration = new Configuration();
        }
        return configuration;
    }

    public String get(String property){
        return extractProperty(property);
    }
}
