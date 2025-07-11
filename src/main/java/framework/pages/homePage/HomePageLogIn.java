package framework.pages.homePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static framework.pages.homePage.HomePageLocators.*;

import io.qameta.allure.Step;
import framework.core.ConfigReader;

public class HomePageLogIn {

    @Step("Go to Log in page")
    public void goToLogInScreen() {
        $x(ACCEPT_COOKIES).click();
        $x(LOG_IN).shouldBe(visible).click();
        webdriver().shouldHave(url(ConfigReader.LOG_IN_URL));

    }
}