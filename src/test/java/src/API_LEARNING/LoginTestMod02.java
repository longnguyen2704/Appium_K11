package src.API_LEARNING;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Platform;
import src.Driver.DriverFactory;
import src.Models.Components.Login.LoginFormComponentMod02;
import src.Models.Pages.LoginScreenMod02;

public class LoginTestMod02 {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);

        try {
            LoginScreenMod02 loginScreen = new LoginScreenMod02(appiumDriver);
            loginScreen.bottomNavComp().clickOnLoginIcon();
            LoginFormComponentMod02 loginFormComp = loginScreen.loginFormComp();
            loginFormComp.inputUsername("teo@sth.com");
            loginFormComp.inputPassword("12345678");
            loginFormComp.clickOnLoginBtn();

        } catch (Exception e) {
            e.printStackTrace();
        }

        appiumDriver.quit();
    }
}
