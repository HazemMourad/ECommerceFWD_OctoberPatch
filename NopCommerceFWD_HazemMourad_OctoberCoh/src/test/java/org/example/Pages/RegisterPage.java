package org.example.Pages;

import org.example.StepDefinitions.St_00_StartingEnding;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    public RegisterPage(){
    PageFactory.initElements(St_00_StartingEnding.driver,this);
    }
    @FindBy(linkText = "Register")
    public WebElement registerButton;

    @FindBy(css = "input#gender-male")
    public WebElement genderButton;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;

    @FindBy(name = "DateOfBirthDay")
    public WebElement dayDropDownList;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement monthDropDownList;
    @FindBy(name = "DateOfBirthYear")
    public WebElement yearDropDownList;

    @FindBy(id = "Email")
    public WebElement emailField;

    @FindBy(id = "Password")
    public WebElement passwordField;
    @FindBy(id="ConfirmPassword")
    public WebElement confirmPasswordField;

    @FindBy(name="register-button")
    public WebElement registerButt;
    @FindBy(css = "div.result")
    public WebElement successMessage;

}
