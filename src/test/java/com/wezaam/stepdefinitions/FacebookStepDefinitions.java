package com.wezaam.stepdefinitions;

import com.wezaam.pages.LoginPage;
import com.wezaam.utilities.ConfigurationReader;
import com.wezaam.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FacebookStepDefinitions {
    LoginPage loginPage=new LoginPage();

    @Given("I am on the {string} page")
    public void iAmOnThePage(String pageName) {

        switch (pageName) {

            case "Facebook":
                Driver.get().get(ConfigurationReader.get("facebookurl"));
                loginPage.setAllowCookies();
                break;
            case "Google":
                Driver.get().get(ConfigurationReader.get("googleurl"));
                break;
        }
    }

    @Then("I check the login page has {string} button")
    public void iCheckTheLoginPageHasButton(String buttonName){
        switch(buttonName){
            case "Create new account":
                Assert.assertTrue("Create new account button is not displayed",loginPage.elementIsDisplayed(buttonName));
                break;
            case "Log In":
                Assert.assertTrue("Log In button is not displayed",loginPage.elementIsDisplayed(buttonName));
                break;
            case "email":
                Assert.assertTrue("Email box is not displayed",loginPage.elementIsDisplayed(buttonName));
                break;
            case "password":
                Assert.assertTrue("Password box is not displayed",loginPage.elementIsDisplayed(buttonName));
                break;

        }
    }


}
