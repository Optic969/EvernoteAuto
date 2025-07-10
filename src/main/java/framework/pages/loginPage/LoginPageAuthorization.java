package framework.pages.loginPage;

import io.qameta.allure.Step;
import framework.core.ConfigReader;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static framework.pages.loginPage.LoginPageLocators.*;

public class LoginPageAuthorization {

    @Step("Unsuccessful login using invalid email/password")
    public void logInApp() {
        $x(EMAIL_FIELD).sendKeys(ConfigReader.INVALID_EMAIL);
        $x(CONTINUE_BUTTON).click();
        $x(PASSWORD_BUTTON).shouldBe(visible).sendKeys(ConfigReader.INVALID_PASSWORD);
        $x(CONTINUE_BUTTON).click();
        $x(INCORRECT_LOGIN_HINT).shouldBe(visible);


    }
}

