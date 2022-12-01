package src.test_flow;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import src.Models.Pages.LoginScreenMod03;

public class BaseFlow {
    protected final AppiumDriver<MobileElement> appiumDriver;

    public BaseFlow(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public void gotoLoginScreen(){
        new LoginScreenMod03(appiumDriver).bottomNavComp().clickOnLoginIcon();
    }
}
