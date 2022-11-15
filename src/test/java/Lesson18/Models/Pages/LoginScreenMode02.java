package Lesson18.Models.Pages;

import Lesson18.Models.Components.Global.BottomNavComponent;
import Lesson18.Models.Components.Login.LoginFormComponentMode02;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginScreenMode02 {
    private final AppiumDriver<MobileElement> appiumDriver;
    public LoginScreenMode02(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public LoginFormComponentMode02 loginFromComp(){
        return new LoginFormComponentMode02(appiumDriver);
    }
    public BottomNavComponent bottomNavComp(){
        return new BottomNavComponent(appiumDriver);
    }
}
