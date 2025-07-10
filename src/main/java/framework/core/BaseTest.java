package framework.core;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Load configuration from properties file or system props
        DriverConfigurator.configure();
        open("/");

        // Set WebDriver manually if needed
        driver = WebDriverRunner.getWebDriver();
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}