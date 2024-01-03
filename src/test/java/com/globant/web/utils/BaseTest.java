package com.globant.web.utils;

import com.globant.web.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public static final String username = System.getenv("USERNAME");
    public static final String password = System.getenv("PASSWORD");
    public WebDriver driver = new ChromeDriver();
    public LoginPage loginPage;
    public InventoryPage inventoryPage;
    public ProductPage productPage;
    public CartPage cartPage;
    public InformationPage informationPage;
    public SuccessPage successPage;
    public OverviewPage overviewPage;
    public MenuBtnPage menuBtnPage;

    @BeforeMethod
    public void beforeTest(){
        loginPage = new LoginPage(driver,"https://www.saucedemo.com/" );
        inventoryPage = new InventoryPage(driver);
        productPage= new ProductPage(driver);
        cartPage= new CartPage(driver);
        informationPage = new InformationPage(driver);
        successPage = new SuccessPage(driver);
        overviewPage= new OverviewPage(driver);
        menuBtnPage= new MenuBtnPage(driver);
        loginPage.enterLogin(username, password);
        System.out.println("Your webpage user is:"+username);
        System.out.println("Your webpage password is:"+password);

    }
    /**
     @Test(dataProvider = "LoginData", dataProviderClass = TestData.class)
     public void LoginTest(String user, String psw) {
        loginPage.enterLogin(user, psw);
     }
     **/

    @AfterMethod
    public void afterTest(){
        driver.close();
    }
}
