package tests;

import framework.core.BaseTest;
import pages.homePage.HomePageLogIn;
import pages.loginPage.LoginPageAuthorization;
import pages.workPage.WorkPage;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EvernoteTests extends BaseTest {

    HomePageLogIn homePage = new HomePageLogIn();
    LoginPageAuthorization loginPage = new LoginPageAuthorization();
    WorkPage workPage = new WorkPage();
    //WorkPageNote workPageNote = new WorkPageNote();

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
        workPage.createNewNote();
        workPage.logOut();
    }

    @Test
    @Order(4)
    @DisplayName("Login again → open the created note")
    public void testLoginAgainOpenCreatedNote() {
        loginPage.loginWithValidCredentials();
        workPage.goToMenuSectionNotes();
        workPage.selectNote();
    }
}