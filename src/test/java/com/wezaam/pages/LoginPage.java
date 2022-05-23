package com.wezaam.pages;

import com.wezaam.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath= "//button[@data-cookiebanner='accept_button']")
    private List<WebElement> allowCookies;

    @FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
    private WebElement createNewAccount;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passContainer")
    private WebElement password;

    @FindBy(xpath = "//button[@data-testid='royal_login_button']")
    private WebElement logIn;

    public boolean elementIsDisplayed(String elementName){
        boolean flag=false;
        switch (elementName){
            case "Create new account":
            if(createNewAccount.isDisplayed()) {
                flag=true;
            }
            break;
            case "Log In":
                if(logIn.isDisplayed()) {
                    flag=true;
                }
            break;
            case "email":
                if(email.isDisplayed()) {
                    flag=true;
                }
                break;
            case "password":
                if(password.isDisplayed()) {
                    flag=true;
                }
            break;

        }
        return flag;
    }

    public void setAllowCookies() {
        if(allowCookies.size()>0){
            allowCookies.get(0).click();
        }
    }
}
