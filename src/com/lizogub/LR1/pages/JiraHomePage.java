package com.lizogub.LR1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class JiraHomePage {
    WebDriver driver;
    String userProfileButtonXPath = "//a[@id='header-details-user-fullname']";

    public JiraHomePage(WebDriver driver){
        this.driver = driver;
    }

    public ExpectedCondition homePageLoaded(){
        return ExpectedConditions.presenceOfElementLocated(By.xpath(userProfileButtonXPath));
    }

    public void checkPresenceOfLoginMenu(){
        assertEquals(driver.findElement(By.xpath(userProfileButtonXPath)).isDisplayed(),true, "Login menu not visible");
    }
}
