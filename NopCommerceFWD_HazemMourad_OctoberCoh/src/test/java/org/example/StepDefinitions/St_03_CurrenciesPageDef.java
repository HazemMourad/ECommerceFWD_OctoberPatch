package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.testng.Assert;

public class St_03_CurrenciesPageDef {
    HomePage currency= new HomePage();
    @When("user select euro currency")
    public void user_select_euro_currency() throws InterruptedException {currency.SelectCurrency();}
    @Then("categories will be changed to the currency symbol")
    public void user_can_find_euro_symbol(){
        currency.CurrencySymol();
        Assert.assertTrue(currency.priceSymbol().getText().contains("€"));
        System.out.println("Done");
    }

}
