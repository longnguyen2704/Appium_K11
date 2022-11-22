package Lesson18.API_LEARNING;

import Lesson18.Models.Components.Login.LoginFormComponentMode02;
import Lesson18.Models.Pages.LoginScreenMode02;
import Lesson18.driver.DriverFactory;
import Lesson18.driver.Platform;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginTestMode02 {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);
        try {
            LoginScreenMode02 loginScreen = new LoginScreenMode02(appiumDriver);
            loginScreen.bottomNavComp().clickOnLoginIcon();
            LoginFormComponentMode02 loginFromComp = loginScreen.loginFromComp();

            loginFromComp.inputUserName("minhlonghades123@gmail.com");
            loginFromComp.inputPassword("Kikilala159");
            loginFromComp.clickOnLoginBtn();

        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.quit();
    }
}
