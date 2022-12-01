package src.API_LEARNING;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Platform;
import src.Driver.DriverFactory;
import src.Models.Components.Login.LoginFormComponentMod03;
import src.Models.Pages.LoginScreenMod03;

public class LoginTestMod03 {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);

        try {
            LoginScreenMod03 loginScreen = new LoginScreenMod03(appiumDriver);
            loginScreen.bottomNavComp().clickOnLoginIcon();
            LoginFormComponentMod03 loginFormComp = loginScreen.loginFormComp();
            loginFormComp
                    .inputUsername("teo@sth.com")
                    .inputPassword("12345678")
                    .clickOnLoginBtn();
        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.quit();
    }
}