package com.saucedemo.testsuite;

import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage=new LoginPage();
    InventoryPage inventoryPage=new InventoryPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedText = "Products";
        String actualText = inventoryPage.getProductText();
        Assert.assertEquals(actualText, expectedText, "Expected Text does not displayed");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        int expectedNumberOfProducts=6;
        int actualNumberOfProducts=inventoryPage.findActualNumberOfProducts();
        Assert.assertEquals(actualNumberOfProducts, expectedNumberOfProducts, "Number of products are not 6");
    }
}
