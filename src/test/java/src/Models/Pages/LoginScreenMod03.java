package src.Models.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import src.Models.Components.Global.BottomNavComponent;
import src.Models.Components.Login.LoginFormComponentMod03;

public class LoginScreenMod03 {
    private final AppiumDriver<MobileElement> appiumDriver;

    public LoginScreenMod03(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public LoginFormComponentMod03 loginFormComp(){
        return new LoginFormComponentMod03(appiumDriver);
    }

    public BottomNavComponent bottomNavComp(){
        return new BottomNavComponent(appiumDriver);
    }
}
