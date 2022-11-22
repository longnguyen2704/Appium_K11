package Lesson18.Models.Pages;

import Lesson18.Models.Components.Global.BottomNavComponent;
import Lesson18.Models.Components.Login.LoginFormComponentMode01;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginScreenMode01 {
    private final AppiumDriver<MobileElement> appiumDriver;
    public LoginScreenMode01(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public LoginFormComponentMode01 loginFromComp(){
        return new LoginFormComponentMode01(appiumDriver);
    }
    public BottomNavComponent bottomNavComp(){
        return new BottomNavComponent(appiumDriver);
    }
}
