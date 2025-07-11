package framework.pages.loginPage;

import io.qameta.allure.Step;
import framework.core.ConfigReader;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static framework.pages.loginPage.LoginPageLocators.*;

public class LoginPageAuthorization {

    @Step("Unsuccessful login using invalid email/password")
    public void loginWithInvalidCredentials() {
        $x(EMAIL_FIELD).sendKeys(ConfigReader.INVALID_EMAIL);
        $x(CONTINUE_BUTTON).click();
        $x(PASSWORD_FIELD).shouldBe(visible).sendKeys(ConfigReader.INVALID_PASSWORD);
        $x(CONTINUE_BUTTON).click();
        $x(INCORRECT_LOGIN_HINT).shouldBe(visible);
    }

    @Step("Successful login using valid email/password")
    public void loginWithValidCredentials() {
        open(ConfigReader.LOG_IN_URL);
        $x(EMAIL_FIELD).shouldBe(visible);
        $x(EMAIL_FIELD).click();
        $x(EMAIL_FIELD).setValue(ConfigReader.VALID_EMAIL);
        $x(CONTINUE_BUTTON).shouldBe(enabled).click();
        $x(PASSWORD_FIELD).click();
        $x(PASSWORD_FIELD).setValue(ConfigReader.VALID_PASSWORD);
        $x(CONTINUE_BUTTON).shouldBe(enabled).click();
        webdriver().shouldHave(url(ConfigReader.CLIENT_WEB_URL), Duration.ofSeconds(10));
    }
}