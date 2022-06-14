package com.pages;

import com.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/span[1]/div[1]/div[1]")
    WebElement myProfile;

    @FindBy(xpath = "//span[contains(text(),'Log Out')]")
    WebElement logout;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]")
    WebElement profileSection;

    @FindBy(xpath = "//span[contains(text(),'Friends')]")
    WebElement findFriends;

    @FindBy(xpath = "//span[contains(text(),'Marketplace')]")
    WebElement marketplace;

    @FindBy(xpath = "//span[contains(text(),'Watch')]")
    WebElement watch;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle() {
        return driver.getTitle();
    }

    public void clickOnProfile(){
        profileSection.click();
    }
    public void clickOnFindFriends() {
        findFriends.click();
    }

    public void clickOnMarketplace(){
        marketplace.click();
    }

    public void clickOnWatch(){
        watch.click();
    }

    public void clickOnMyProfile(){
        myProfile.click();
    }

    public void clickOnLogout(){
        logout.click();
    }
}
