package com.lizogub.LR1.test;

import com.lizogub.LR1.pages.JiraHomePage;
import com.lizogub.LR1.pages.JiraLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JiraLoginTest {
    @Test
    public void loginTest(){
        System.setProperty("webdriver.chrome.driver","C:\\IdeaProjects\\Libraries\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);

        JiraLoginPage loginPage = new JiraLoginPage(driver);
        JiraHomePage homePage = new JiraHomePage(driver);

        driver.get("http://jira.hillel.it:8080/login.jsp");
        loginPage.enterLogin("webinar5");
        loginPage.enterPassword("webinar5");
        loginPage.clickLoginButton();
        wait.until(homePage.homePageLoaded());

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        driver.quit();
    }
}
