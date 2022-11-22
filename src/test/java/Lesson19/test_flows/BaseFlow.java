package Lesson19.test_flows;

import Lesson18.Models.Pages.LoginScreenMode03;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseFlow {

    protected final AppiumDriver<MobileElement> appiumDriver;
    public BaseFlow(AppiumDriver<MobileElement> appiumDriver){
        this.appiumDriver = appiumDriver;
    }
    public void goToLoginScreen(){
        new LoginScreenMode03(appiumDriver).bottomNavComp().clickOnLoginIcon();
    }
}
