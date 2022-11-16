package org.example.Pages;

import org.example.StepDefinitions.St_00_StartingEnding;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(St_00_StartingEnding.driver,this);
    }
    @FindBy(linkText = "Log in")
    public WebElement loginLink;
    @FindBy(id="Email")
    public WebElement email;
    @FindBy(name = "Password")
    public WebElement password;

    @FindBy(css ="button.button-1.login-button")
    public WebElement loginButton;

    @FindBy(linkText = "My account")
    public WebElement myAccountButton;
    @FindBy(css = "div.message-error.validation-summary-errors")
    public WebElement unLoggedMessage;

}
