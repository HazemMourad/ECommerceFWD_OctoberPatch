package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.LoginPage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.util.Properties;

public class St_02_LoginPageDef {

    LoginPage loginPage = new LoginPage();
    public static Properties prop;

    @Given("user go to login page")
    public void navtologin(){
        loginPage.loginLink.click();
    }
    @When("user login with \"valid\" \"HazemMourad@example.com\" and \"P@ssw0rd\"")
    public void vaildData(){
    loginPage.email.sendKeys("HazemMourad@example.com");
    loginPage.password.sendKeys("P@ssw0rd");
    }
    @And("user press on login button")
    public void loginBtnClick(){
    loginPage.loginButton.click();
    }
    SoftAssert softAssert =new SoftAssert();
    @Then("user login to the system successfully")
    public void logedSuccessfully(){
    softAssert.assertEquals(St_00_StartingEnding.driver.getCurrentUrl(),prop.getProperty("url"));
    softAssert.assertEquals(loginPage.myAccountButton.getText(),"My account");
    }

    @When("user login with \"invalid\" \"wrong@example.com\" and \"P@ssw0rd\"")
    public void invaildData(){
        loginPage.email.sendKeys("wrong@example.com");
        loginPage.password.sendKeys("P@ssw0rd");
    }

    @Then("user could not login to the system")
    public void unlogedSuccessfully(){
        softAssert.assertTrue(loginPage.unLoggedMessage.getText().contains("Login was unsuccessful."));
        softAssert.assertEquals(loginPage.unLoggedMessage.getCssValue("color"),
                Color.fromString("rgba(228, 67, 75, 1)").asHex());
    }



}
