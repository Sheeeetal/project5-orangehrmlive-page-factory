package com.orangehrmlive.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.customlisteners.CustomListeners;
import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(name = "username")
    WebElement usernameField;

    @CacheLookup
    @FindBy(name= "password")
    WebElement passwordField ;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnLoginButton;

    @CacheLookup
    @FindBy(xpath = "//h6[contains(@class,'header-breadcrumb-module')]")
    WebElement verifyDashboardText;


    public void enterUserName(String name){
        sendTextToElement(usernameField,name);
        CustomListeners.test.log(Status.PASS,"name");}

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
        CustomListeners.test.log(Status.PASS,"password");}


    public String verifyMessage(){
        CustomListeners.test.log(Status.PASS,"verifyDashboardText");
        return getTextFromElement(verifyDashboardText);
    }
    public void loginButton(){
        clickOnElement(clickOnLoginButton);
        CustomListeners.test.log(Status.PASS,"Click on loginButton");}
    }



