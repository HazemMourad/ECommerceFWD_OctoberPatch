package org.example.Pages;

import org.example.StepDefinitions.St_00_StartingEnding;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class HomePage {
    public HomePage(){PageFactory.initElements(St_00_StartingEnding.driver,this);}
    public WebElement getElementByCssSelector(String element){
        return St_00_StartingEnding.driver.findElement(By.cssSelector(element));}

    public void SelectCurrency() throws InterruptedException {
        WebElement euro = St_00_StartingEnding.driver.findElement(By.name("customerCurrency"));
        Select select = new Select(euro);
        Thread.sleep(2000);
        select.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");

    }
    public void CurrencySymol(){
        String expectedCurrency = "Euro";
        String actualCurrency = getElementByCssSelector("option[selected]").getText();
        Assert.assertTrue(actualCurrency.contains(expectedCurrency));
    }

    public WebElement priceSymbol(){
        return St_00_StartingEnding.driver.findElement(By.cssSelector("span.price.actual-price"));
    }

    public WebElement searchBox(){

        return St_00_StartingEnding.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement page_title(){

        return St_00_StartingEnding.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
    public WebElement computer_category(){
        return St_00_StartingEnding.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
    }
    public WebElement desktops_subcategory(){
        return St_00_StartingEnding.driver.findElement(By.cssSelector("a[href=\"/desktops\"]"));
    }
    public WebElement first_slider_selector(){
        return St_00_StartingEnding.driver.findElement(By.cssSelector("a[rel=\"0\"]"));
    }
    public WebElement slider_image(){
        return St_00_StartingEnding.driver.findElement(By.id("nivo-slider"));
    }

    public WebElement second_slider_selector(){
        return St_00_StartingEnding.driver.findElement(By.cssSelector("a[rel=\"1\"]"));
    }
    public WebElement facebook_page(){
        return St_00_StartingEnding.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }
    public WebElement twitter_page(){
        return St_00_StartingEnding.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }
    public WebElement rss_page(){
        return St_00_StartingEnding.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }
    public WebElement youtube_page(){
        return St_00_StartingEnding.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }
    public List<WebElement> wishlistButtons(){
        return St_00_StartingEnding.driver.findElements(By.className("add-to-wishlist-button"));
    }
    public WebElement success_bar(){
        return St_00_StartingEnding.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement wishlist(){
        return St_00_StartingEnding.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
    }
    public WebElement item_count(){
        return St_00_StartingEnding.driver.findElement(By.cssSelector("input[class=\"qty-input\"]"));
    }

}
