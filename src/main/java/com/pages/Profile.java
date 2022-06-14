package com.pages;

import com.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile extends TestBase {



    @FindBy(xpath = "//span[contains(text(),'Edit profile')]")
    WebElement editProfile;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]")
    WebElement editProfilePicture;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]")
    WebElement addCoverPhoto;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]")
    WebElement addBio;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement cancel;
//
//    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")
//    WebElement profilepicExit;

    @FindBy(xpath = "//body/div[@id='mount_0_0_0F']/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement profilepicExit;

    public Profile() {
        PageFactory.initElements(driver, this);
    }

    public String verifyProfileTitle() {
        return driver.getTitle();
    }

    public void clickonEditProfile(){
        editProfile.click();
    }

    public void clickonChangeProfilePic(){
        editProfilePicture.click();
    }

    public void clickonAddCoverPhoto(){
        addCoverPhoto.click();
    }

    public void clickonAddBio(){
        addBio.click();
    }

    public void clikOnCancel(){
        cancel.click();
    }

    public void clickExitonChangeProfilePic(){
        profilepicExit.click();
    }
}
