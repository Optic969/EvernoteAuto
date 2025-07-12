package framework.utils;

import framework.core.ConfigReader;

public class TestData {
    public static final String INVALID_EMAIL = ConfigReader.get("invalid_email");
    public static final String INVALID_PASSWORD = ConfigReader.get("invalid_password");
    public static final String VALID_EMAIL = ConfigReader.get("valid_email");
    public static final String VALID_PASSWORD = ConfigReader.get("valid_password");
    public static final String LOG_IN_URL = ConfigReader.get("log_in_url");
    public static final String CLIENT_WEB_URL = ConfigReader.get("client_web_url");
}
