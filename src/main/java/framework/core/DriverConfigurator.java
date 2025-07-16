package framework.core;

import com.codeborne.selenide.Configuration;

public class DriverConfigurator {

    public static void configure() {
        //Configuration.browser = System.getProperty("browser", "chrome");
        //Configuration.headless = Boolean.parseBoolean(System.getProperty("headless", "false"));
        Configuration.baseUrl = System.getProperty("baseUrl", "https://evernote.com");
        Configuration.browserSize = "1600x900";
        Configuration.timeout = 10000;
        Configuration.reopenBrowserOnFail = false;
    }
}