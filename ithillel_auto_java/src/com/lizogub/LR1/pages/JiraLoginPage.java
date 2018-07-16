package com.lizogub.LR1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JiraLoginPage {
    WebDriver driver;
    String loginInputXPath = "//*[@id='login-form-username']";
    String passwordInputXPath = "//*[@id='login-form-password']";
    String loginButtonXPath = "//*[@id='login-form-submit']";

    public JiraLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterLogin(String login){
        driver.findElement(By.xpath(loginInputXPath)).sendKeys(login);
    }

    public void enterPassword(String password){
        driver.findElement(By.xpath(passwordInputXPath)).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(By.xpath(loginButtonXPath)).click();
    }
}
