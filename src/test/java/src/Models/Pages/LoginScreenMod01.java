package src.Models.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import src.Models.Components.Global.BottomNavComponent;
import src.Models.Components.Login.LoginFormComponent;

public class LoginScreenMod01 {
    private final AppiumDriver<MobileElement> appiumDriver;

    public LoginScreenMod01(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public LoginFormComponent loginFormComp(){
        return new LoginFormComponent(appiumDriver);
    }

    public BottomNavComponent bottomNavComp(){
        return new BottomNavComponent(appiumDriver);
    }
}
