package framework.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static final String INVALID_EMAIL;
    public static final String INVALID_PASSWORD;
    public static final String VALID_EMAIL;
    public static final String VALID_PASSWORD;
    public static final String LOG_IN_URL;
    public static final String CLIENT_WEB_URL;
    private static final Properties properties = new Properties();

    static {
        try {
            FileInputStream input = new FileInputStream("src/main/resources/config.properties");
            properties.load(input);

            INVALID_EMAIL = properties.getProperty("invalid_email");
            INVALID_PASSWORD = properties.getProperty("invalid_password");
            VALID_EMAIL = properties.getProperty("valid_email");
            VALID_PASSWORD = properties.getProperty("valid_password");
            LOG_IN_URL = properties.getProperty("log_in_url");
            CLIENT_WEB_URL = properties.getProperty("client_web_url");

        } catch (IOException e) {
            throw new RuntimeException("Couldn't load config.properties: " + e.getMessage());
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}