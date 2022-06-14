package com.testcases;

import com.base.TestBase;
import com.pages.FindFriends;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindFriendsTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    FindFriends findFriends;

    public FindFriendsTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        findFriends = new FindFriends();
        homePage.clickOnFindFriends();
        Thread.sleep(2000);

    }

    @Test(priority = 1)
    public void verifyFindFriendsTitleTest() {
        String findFriendsTitle = findFriends.verifyFindFriendsTitle();
        Assert.assertEquals(findFriendsTitle, "Friends | Facebook", "Home Page is Incorrect");
    }

    @Test(priority = 2)
    public void verifyFriendRequestLink(){
        findFriends.clickonFindFriend();
    }

    @Test(priority = 3)
    public void verifySuggestionsLink(){
        findFriends.clickonSuggestions();
    }

    @Test(priority = 4)
    public void verifyBirthdaysLink() {
        findFriends.clickonBithdays();
    }

    @Test(priority = 4)
    public void verifyCustomsLink()  {
        findFriends.clickonCustomLists();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
