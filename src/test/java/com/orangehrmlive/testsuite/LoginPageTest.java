package com.orangehrmlive.testsuite;

import com.orangehrmlive.customlisteners.CustomListeners;
import com.orangehrmlive.pages.LoginPage;
import com.orangehrmlive.testbase.BaseTest;
import com.orangehrmlive.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    ForgotPasswordTest forgotPasswordTest;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        forgotPasswordTest = new ForgotPasswordTest();
        loginPage = new LoginPage();
    }
    @Test(groups = {"sanity","regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        LoginPage loginPage = new LoginPage();
        //login with valid username
        loginPage.enterUserName("Admin");

        //login with valid password
        loginPage.enterPassword("admin123");

        //click on loginButton
        loginPage.loginButton();

        //verify Dashboard text
        String expectedText = "Dashboard";
        String actualText = loginPage.verifyMessage();
        Assert.assertEquals(actualText,expectedText,"page not displayed");
    }
}



