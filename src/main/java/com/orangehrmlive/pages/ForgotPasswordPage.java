
package com.orangehrmlive.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.customlisteners.CustomListeners;
import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends Utility {
    @CacheLookup
    @FindBy(name = "username")
    WebElement usernameField;
    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement clickOnLoginButton;
    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement clickOnForgotPassword;
    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Reset Password']")
    WebElement verifyResetPassword;

    public void enterUsername(String Username){
        CustomListeners.test.log(Status.PASS,"Enter EmailId "+Username);
    sendTextToElement(usernameField, Username);

}
    public void enterPassword(String Password) {
        sendTextToElement(passwordField,Password);
        CustomListeners.test.log(Status.PASS,"Enter Password " + Password);
    }
    public void loginButton(){
        clickOnElement(clickOnLoginButton);
        CustomListeners.test.log(Status.PASS,"Click on loginButton");
    }


    public void forgotPassword(){
        clickOnElement(clickOnForgotPassword);
        CustomListeners.test.log(Status.PASS,"Click on loginButton");
    }
    public String verifyMessage()
    { CustomListeners.test.log(Status.PASS,"verifyResetPassword");
        return getTextFromElement(verifyResetPassword);
    }

}