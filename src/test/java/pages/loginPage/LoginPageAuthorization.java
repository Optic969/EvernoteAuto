package pages.loginPage;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import framework.core.ConfigReader;
import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class LoginPageAuthorization {

    private final SelenideElement emailField = $x("//input[@id='email']");
    private final SelenideElement continueButton = $x("//span[normalize-space()='Continue']");
    private final SelenideElement passwordField = $x("//input[@placeholder='Password']");
    private final SelenideElement incorrectLoginHint = $x("//span[text()='Please verify your credentials. The password entered is incorrect.']");
    private final SelenideElement signUpLink = $x("//span[normalize-space()='Sign up']");

    @Step("Unsuccessful login using invalid credentials")
    public void loginWithInvalidCredentials() {
        emailField.setValue(ConfigReader.get("invalid_email"));
        continueButton.click();
        passwordField.shouldBe(visible).setValue(ConfigReader.get("invalid_password"));
        continueButton.click();
        incorrectLoginHint.shouldBe(visible);
    }

    @Step("Successful login using valid credentials")
    public void loginWithValidCredentials() {
        open(ConfigReader.get("log_in_url"));
        emailField.shouldBe(visible).click();
        emailField.setValue(ConfigReader.get("valid_email"));
        continueButton.shouldBe(enabled).click();
        passwordField.click();
        passwordField.setValue(ConfigReader.get("valid_password"));
        continueButton.shouldBe(enabled).click();
        webdriver().shouldHave(url(ConfigReader.get("client_web_url")), Duration.ofSeconds(10));
    }
}