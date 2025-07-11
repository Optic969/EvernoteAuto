package framework.pages.workPage;

import framework.core.ConfigReader;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static framework.pages.workPage.WorkPageLocators.*;


public class WorkPageLogOut {

    @Step("logOut")
    public void logOut() {
        $x(USER_EXPAND_MENU).click();
        $x(SIGN_OUT_USER_BUTTON).shouldBe(visible).click();
        webdriver().shouldHave(url(ConfigReader.LOG_IN_URL));
    }


}
