package Lesson18.API_LEARNING;

import Lesson18.Models.Components.Login.LoginFormComponentMode01;
import Lesson18.Models.Pages.LoginScreenMode01;
import Lesson18.driver.DriverFactory;
import Lesson18.driver.Platform;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginTestMode01 {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);
        try {
            LoginScreenMode01 loginScreen = new LoginScreenMode01(appiumDriver);
            loginScreen.bottomNavComp().clickOnLoginIcon();
            LoginFormComponentMode01 loginFromComp = loginScreen.loginFromComp();
            loginFromComp.usernameElem().sendKeys("minhlonghades123@gmail.com");
            loginFromComp.passwordElem().sendKeys("Kikilala159");
            loginFromComp.loginBtnElem().click();

        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.quit();
    }
}
