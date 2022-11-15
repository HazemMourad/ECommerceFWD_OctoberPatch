package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.stream.IntStream;

public class St_04_SearchDef {
    HomePage homePage=new HomePage();
    SoftAssert softAssert =new SoftAssert();
    @Given("user click on search box")
    public void searchBox(){
        homePage.searchBox().click();
    }
    @When("^user enter product \"(.*)\"$")
    public void searchByName(String product){
        homePage.searchBox().sendKeys(product);
        homePage.searchBox().sendKeys(Keys.ENTER);
    }
    @Then("^results should have the same \"(.*)\"$")
    public void checkResults(String keyword){
        System.out.println(keyword);
        Assert.assertTrue(St_00_StartingEnding.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search"));
        int no_of_results= St_00_StartingEnding.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
        System.out.println(no_of_results);
        IntStream.range(0, no_of_results).forEach(i -> {
            System.out.println(St_00_StartingEnding.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(i).findElement(By.xpath("./child::*")).getText().toLowerCase());
            softAssert.assertTrue(St_00_StartingEnding.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(i).findElement(By.xpath("./child::*")).getText().toLowerCase().contains(keyword), "not " + keyword);
        });
        softAssert.assertAll();
    }
    @And("user click on the product")
    public void clickTheProduct(){
        St_00_StartingEnding.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(0).findElement(By.xpath("./child::*")).click();
    }
    @Then("^result should have the same \"(.*)\"$")
    public void checkTheResult(String sku){
        System.out.println(St_00_StartingEnding.driver.findElement(By.cssSelector("div[class=\"sku\"]")).findElements(By.xpath("./child::*")).get(1).getText());
        softAssert.assertTrue(St_00_StartingEnding.driver.findElement(By.cssSelector("div[class=\"sku\"]")).findElements(By.xpath("./child::*")).get(1).getText().contains(sku));
        softAssert.assertAll();
    }
}
