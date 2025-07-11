package tests;

import framework.core.BaseTest;
import framework.pages.homePage.*;
import framework.pages.loginPage.LoginPageAuthorization;
import framework.pages.workPage.WorkPageLogOut;
import framework.pages.workPage.WorkPageNote;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EvernoteTests extends BaseTest {

    HomePageLogIn homePage = new HomePageLogIn();
    LoginPageAuthorization loginPage = new LoginPageAuthorization();
    WorkPageLogOut workPageLogOut = new WorkPageLogOut();
    WorkPageNote workPageNote = new WorkPageNote();

    @Test
    @Order(1)
    @DisplayName("Unsuccessful login using invalid email/password")
    public void testUnsuccessfulLogIn() {
        homePage.goToLogInScreen();
        loginPage.loginWithInvalidCredentials();

    }

    @Test
    @Order(2)
    @DisplayName("Unsuccessful login using invalid email/password")
    public void testSuccessfulLogin() {
        loginPage.loginWithValidCredentials();
    }

    @Test
    @Order(3)
    @DisplayName("Create a note → logout")
    public void testCreateNoteAndLogout() {
        workPageNote.createNewNote();
        workPageLogOut.logOut();
    }

    @Test
    @Order(4)
    @DisplayName("Login again → open the created note")
    public void testLoginAgainOpenCreatedNote() {
        loginPage.loginWithValidCredentials();
        workPageNote.goToMenuSectionNotes();
        workPageNote.selectNote();
    }
}