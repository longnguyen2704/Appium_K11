package Lesson18.API_LEARNING;

import Lesson18.Models.Components.Login.LoginFormComponentMode03;
import Lesson18.Models.Pages.LoginScreenMode03;
import Lesson18.driver.DriverFactory;
import Lesson18.driver.Platform;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginTestMode03 {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);
        try {
            LoginScreenMode03 loginScreen = new LoginScreenMode03(appiumDriver);
            loginScreen.bottomNavComp().clickOnLoginIcon();
            LoginFormComponentMode03 loginFromComp = loginScreen.loginFromComp();

            loginFromComp
                    .inputUserName("minhlonghades123@gmail.com")
                    .inputPassword("Kikilala159")
                    .clickOnLoginBtn();

        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.quit();
    }
}
