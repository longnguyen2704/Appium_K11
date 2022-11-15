package Lesson18.Models.Pages;

import Lesson18.Models.Components.Global.BottomNavComponent;
import Lesson18.Models.Components.Login.LoginFormComponentMode03;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginScreenMode03 {
    private final AppiumDriver<MobileElement> appiumDriver;
    public LoginScreenMode03(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public LoginFormComponentMode03 loginFromComp(){
        return new LoginFormComponentMode03(appiumDriver);
    }
    public BottomNavComponent bottomNavComp(){
        return new BottomNavComponent(appiumDriver);
    }
}
