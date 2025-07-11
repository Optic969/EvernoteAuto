package tests;

import framework.core.BaseTest;
import framework.pages.homePage.*;
import framework.pages.loginPage.LoginPageAuthorization;
import org.junit.jupiter.api.*;


public class EvernoteTests extends BaseTest {

    HomePageLogIn homePage = new HomePageLogIn();
    LoginPageAuthorization loginPage = new LoginPageAuthorization();

    @Test
    @Order(1)
    @DisplayName("Go to login screen")
    public void testGoToLogInScreen() {
        homePage.goToLogInScreen();
        loginPage.loginWithInvalidCredentials();

    }
}