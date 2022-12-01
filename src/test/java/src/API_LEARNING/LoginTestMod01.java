package src.API_LEARNING;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Platform;
import src.Driver.DriverFactory;
import src.Models.Components.Login.LoginFormComponent;
import src.Models.Pages.LoginScreenMod01;

public class LoginTestMod01 {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);

        try {
            LoginScreenMod01 loginScreen = new LoginScreenMod01(appiumDriver);
            loginScreen.bottomNavComp().clickOnLoginIcon();
            LoginFormComponent loginFormComp = loginScreen.loginFormComp();

            loginFormComp.usernameElem().sendKeys("teo@sth.com");
            loginFormComp.passwordElem().sendKeys("12345678");
            loginFormComp.loginBtnElem().click();

        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.quit();
    }
}
