package pages.homePage;

import io.qameta.allure.Step;
import framework.core.ConfigReader;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class HomePageLogIn {

    private final SelenideElement acceptCookiesButton = $x("//span[text()='Accept all cookies']");
    private final SelenideElement logInButton = $x("//span[text()='Log in']");

    @Step("Go to Log in page")
    public void goToLogInScreen() {
        acceptCookiesButton.click();
        logInButton.shouldBe(visible).click();
        webdriver().shouldHave(url(ConfigReader.get("log_in_url")), Duration.ofSeconds(10));
    }
}
