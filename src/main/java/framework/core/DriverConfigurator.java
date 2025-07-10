package framework.core;

import com.codeborne.selenide.Configuration;

public class DriverConfigurator {
    public static void configure() {
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.baseUrl = System.getProperty("baseUrl", "https://evernote.com");
        Configuration.browserSize = "1920x1080";
        Configuration.headless = Boolean.parseBoolean(System.getProperty("headless", "false"));
        Configuration.timeout = 6000;
    }
}
