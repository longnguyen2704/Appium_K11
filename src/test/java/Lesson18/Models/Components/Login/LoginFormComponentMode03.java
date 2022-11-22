package Lesson18.Models.Components.Login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginFormComponentMode03 {

    private final AppiumDriver<MobileElement> appiumDriver;
    private static final By usernameSel  = MobileBy.AccessibilityId("input-email");
    private static final By incorrectEmailTxtSel
            = MobileBy.xpath("//*[contains(@text,'Please enter a valid email address')]");
    private static final By passwordSel  = MobileBy.AccessibilityId("input-password");
    private static final By incorrectPasswordTxtSel
            = MobileBy.xpath("//*[contains(@text,'Please enter at least 8 characters')]");
    private static final By loginBtnSel  = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup");

    public LoginFormComponentMode03(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public LoginFormComponentMode03 inputUserName(String username){
        MobileElement usernameElem = appiumDriver.findElement(usernameSel);
        usernameElem.clear();
        usernameElem.sendKeys(username);
        return this;
    }
    public String invalidEmailTxt(){
        return appiumDriver.findElement(incorrectEmailTxtSel).getText();
    }
    public LoginFormComponentMode03 inputPassword(String password){
        appiumDriver.findElement(passwordSel).sendKeys(password);
        return this;
    }

    public String invalidPasswordTxt(){
        return appiumDriver.findElement(incorrectPasswordTxtSel).getText();
    }
    public LoginFormComponentMode03 clickOnLoginBtn(){
        appiumDriver.findElement(loginBtnSel).click();
        return this;
    }
}