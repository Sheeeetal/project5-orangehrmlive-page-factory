package com.orangehrmlive.testsuite;

import com.orangehrmlive.customlisteners.CustomListeners;
import com.orangehrmlive.pages.ForgotPasswordPage;
import com.orangehrmlive.pages.LoginPage;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class ForgotPasswordTest extends BaseTest {
    ForgotPasswordPage forgotPasswordPage;
    LoginPage loginPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        forgotPasswordPage = new ForgotPasswordPage();
        loginPage = new LoginPage();
    }
    @Test (groups = {"smoke","regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        forgotPasswordPage.forgotPassword();
        String expectedMessage = "Reset Password";
        Assert.assertEquals(forgotPasswordPage.verifyMessage(), expectedMessage, "Message not found");
    }
}

