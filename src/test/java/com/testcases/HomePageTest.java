package com.testcases;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }


    @Test(priority = 1)
    public void verifyHomePageTitleTest() {
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Facebook", "Home Page is Incorrect");
    }

    @Test(priority = 2)
    public void verifyFindFriendsLink() {
        homePage.clickOnFindFriends();
    }

    @Test(priority = 3)
    public void verifyMarketplaceLink(){
        homePage.clickOnMarketplace();
    }

    @Test(priority = 4)
    public void verifyWatchLink(){
        homePage.clickOnWatch();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
