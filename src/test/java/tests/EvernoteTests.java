package tests;

import framework.core.BaseTest;
import framework.pages.homePage.*;
import framework.pages.loginPage.LoginPageAuthorization;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EvernoteTests extends BaseTest {

    HomePageLogIn homePage = new HomePageLogIn();
    LoginPageAuthorization loginPage = new LoginPageAuthorization();

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

}