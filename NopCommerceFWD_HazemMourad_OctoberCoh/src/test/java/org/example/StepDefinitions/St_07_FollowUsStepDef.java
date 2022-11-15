package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.testng.Assert;

import java.util.ArrayList;

public class St_07_FollowUsStepDef {
    HomePage homePage=new HomePage();

    @When("user opens facebook link")
    public void facebook_click() throws InterruptedException {
        homePage.facebook_page().click();
        Thread.sleep(2000);
    }
    @When("user opens twitter link")
    public void twitter_click() throws InterruptedException {
        homePage.twitter_page().click();
        Thread.sleep(2000);
    }
    @When("user opens rss link")
    public void rss_click() throws InterruptedException {
        homePage.rss_page().click();
        Thread.sleep(2000);
    }
    @When("user opens youtube link")
    public void youtube_click() throws InterruptedException {
        homePage.youtube_page().click();
        Thread.sleep(2000);
    }
    @Then("^\"(.*)\" is opened in new tab$")
    public void checkURL(String url){
        ArrayList<String> tabs = new ArrayList<>(St_00_StartingEnding.driver.getWindowHandles());
        St_00_StartingEnding.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(St_00_StartingEnding.driver.getCurrentUrl().contains(url));
        St_00_StartingEnding.driver.close();
        St_00_StartingEnding.driver.switchTo().window(tabs.get(0));
        System.out.println(St_00_StartingEnding.driver.getCurrentUrl());
        System.out.println(St_00_StartingEnding.driver.getTitle());
    }
    @Then("^\"(.*)\" is opened in the same tab$")
    public void checkRSS_URL(String url){

        Assert.assertTrue(St_00_StartingEnding.driver.getCurrentUrl().contains(url));
        System.out.println(St_00_StartingEnding.driver.getCurrentUrl());
        System.out.println(St_00_StartingEnding.driver.getTitle());
    }
}
