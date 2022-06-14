package com.testcases;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.Profile;
import com.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfileTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    Profile profile;

    public ProfileTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        profile = new Profile();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        Thread.sleep(2000);
        homePage.clickOnProfile();
        Thread.sleep(2000);
        profile.clickonEditProfile();
        Thread.sleep(2000);

    }

    @Test(priority = 1)
    public void verifyFindFriendsTitleTest() {
        String editProfileTitle = profile.verifyProfileTitle();
        Assert.assertEquals(editProfileTitle   , "John Smith | Facebook", "Home Page is Incorrect");
    }

    @Test(priority = 2)
    public void verifyEditProfilePic()  {
        profile.clickonChangeProfilePic();
    }

    @Test(priority = 3)
    public void verifyAddCoverPhoto(){
        profile.clickonAddCoverPhoto();
    }

    @Test(priority = 4)
    public void verifyEditBio(){
        profile.clickonAddBio();
    }

    @AfterMethod
    public void tearDown()  {
        driver.quit();
    }
}
