package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void invalidLoginShouldShowErrorMessage() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("locked_out_user", "wrong_password");

        Assert.assertTrue(loginPage.getErrorMessage().contains("Epic sadface"));
    }
}