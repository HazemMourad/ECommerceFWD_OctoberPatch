package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.RegisterPage;
import org.openqa.selenium.devtools.v85.dom.model.RGBA;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.Optional;

public class St_01_RegisterPageDef {

    RegisterPage registerPage = new RegisterPage();

    @Given("user go to register page")
    public void register_page(){
        registerPage.registerButton.click();
    }

    @And("user select gender type")
    public void selectGNDR(){
        registerPage.genderButton.click();
    }

    @And("user enter first name \"Hazem\" and last name \"Mourad\"")
    public void ENTRfullname(){
        registerPage.firstName.sendKeys("Hazem");
        registerPage.lastName.sendKeys("Mourad");
    }

    Select selectObj = null;
    @And("user enter date of birth")
    public void ENTRdate(){

        selectObj= new Select(registerPage.dayDropDownList);
        selectObj.selectByValue("31");
        selectObj= new Select(registerPage.monthDropDownList);
        selectObj.selectByIndex(10);
        selectObj= new Select(registerPage.yearDropDownList);
        selectObj.selectByVisibleText("1993");
    }

    @And("user enter email \"HazemMourad@example.com\" field")
    public void enterEmail(){
        registerPage.emailField.sendKeys
                ("HazemMourad@example.com");
    }

    @And("user fills Password fields \"P@ssw0rd\" \"Password\"")
    public void enterPass(){
        registerPage.passwordField.sendKeys("P@ssw0rd");
        registerPage.confirmPasswordField.sendKeys("P@ssw0rd");
    }
    @And("user clicks on register button")

    public void regBTN_click(){
        registerPage.registerButt.click();
    }
    SoftAssert sftassert =new SoftAssert();
    @Then("success message is displayed")
    public void succesMSG(){
        sftassert.assertTrue(registerPage.successMessage.getText().contains("Your registration completed"));
        sftassert.assertEquals(registerPage.successMessage.getCssValue("color"),new RGBA(76, 177, 124, Optional.of(1)));
    }
}
