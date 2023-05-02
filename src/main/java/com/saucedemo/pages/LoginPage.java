package com.saucedemo.pages;

import com.saucedemo.utilities.Utilities;
import org.openqa.selenium.By;

public class LoginPage extends Utilities {
    By userNameField=By.id("user-name");
    By passwordField=By.id("password");
    By loginButton=By.id("login-button");

    public void enterUserName(String userName){
        sendTextToElement(userNameField,userName);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

}
