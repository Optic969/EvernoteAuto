package pages.workPage;

import framework.core.ConfigReader;
import io.qameta.allure.Step;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class WorkPage {

    private final SelenideElement userExpandMenu = $x("//div[@id='qa-USER_PORTRAIT']");
    private final SelenideElement signOutUserButton = $x("//span[normalize-space()='Sign out user969e34585058982f0de']");
    private final SelenideElement noteButton = $x("//button[.//span[text()='Note']]");
    private final SelenideElement notesMenuButton = $x("//span[normalize-space()='Notes']");
    private final SelenideElement noteTitleField = $x("//textarea[@placeholder='Title']");
    private final SelenideElement testNoteTitle = $x("//div[@id[contains(., 'qa-NOTES_SIDEBAR_NOTE_TITLE')]]//span[text()='TestNote']");

    @Step("Log out from user account")
    public void logOut() {
        userExpandMenu.click();
        signOutUserButton.shouldBe(visible).click();
        webdriver().shouldHave(url(ConfigReader.get("log_in_url")), Duration.ofSeconds(10));
    }

    @Step("Create a note")
    public void createNewNote() {
        noteButton.shouldBe(visible).click();
        noteTitleField.click();
        noteTitleField.sendKeys("TestNote");
        noteButton.click();
    }

    @Step("Go to menu section Notes")
    public void goToMenuSectionNotes() {
        notesMenuButton.shouldBe(visible).click();
    }

    @Step("Select a note")
    public void selectNote() {
        testNoteTitle.shouldBe(visible).click();
    }
}