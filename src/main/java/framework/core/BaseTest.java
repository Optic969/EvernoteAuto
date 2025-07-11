package framework.core;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver;

    @BeforeAll
    public void setUp() {
        // Load configuration from properties file or system props
        DriverConfigurator.configure();
        open("/");

        // Set WebDriver manually if needed
        driver = WebDriverRunner.getWebDriver();
    }

    @AfterAll
    public void tearDown() {
        closeWebDriver();
    }
}