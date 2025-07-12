package pages.workPage;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static pages.workPage.WorkPageLocators.*;

public class WorkPageNote {

    @Step("Create a note")
    public void createNewNote() {
        $x(NOTE_BUTTON).shouldBe(visible);
        $x(NOTE_BUTTON).click();
        $x(NOTE_TITLE).click();
        $x(NOTE_TITLE).sendKeys("TestNote");
        $x(NOTE_BUTTON).click();


    }

    @Step("Go to menu section Notes")
    public void goToMenuSectionNotes() {
        $x(NOTES_MENU_BUTTON).shouldBe(visible).click();
    }

    @Step("Select a note")
    public void selectNote() {
        $x(TEST_TITLE).shouldBe(visible).click();
    }

}
