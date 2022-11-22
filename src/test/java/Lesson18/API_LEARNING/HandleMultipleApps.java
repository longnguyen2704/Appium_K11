package Lesson18.API_LEARNING;

import Lesson18.driver.AppPackages;
import Lesson18.driver.DriverFactory;
import Lesson18.driver.Platform;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import java.time.Duration;

public class HandleMultipleApps {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);
        try {
            //Navigate to login form
            MobileElement loginButtonElement = appiumDriver.findElement(MobileBy.AccessibilityId("Login"));
            loginButtonElement.click();

            //Find login form elements
            MobileElement emailInputElement = appiumDriver.findElement(MobileBy.AccessibilityId("input-email"));
            MobileElement passwordInputElement = appiumDriver.findElement(MobileBy.AccessibilityId("input-password"));
            MobileElement loginBtnElem = appiumDriver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup"));

            //Interact with login form | fill username + password
            emailInputElement.sendKeys("minhlonghades123@gmail.com");
            passwordInputElement.sendKeys("Kikilala159");
            loginBtnElem.click();

            //Run app in background
            appiumDriver.runAppInBackground(Duration.ofSeconds(-1));

            //Open setting app
            appiumDriver.activateApp(AppPackages.SETTINGS);
            appiumDriver.findElement(MobileBy.xpath("//*[@text='Connections']")).click();
            boolean isWifiOff = appiumDriver.findElements(MobileBy.xpath("//*[@text='ALTEK_4_5G']")).isEmpty();
            int timeToToggle = isWifiOff ? 1 : 2;
            MobileElement toggleElem = appiumDriver.findElement(MobileBy.id("android:id/switch_widget"));
            for (int toggleTime = 0; toggleTime < timeToToggle; toggleTime++) {
                toggleElem.click();
            }

            // Comeback main app
            appiumDriver.activateApp(AppPackages.WEBDRIVER_IO);
            appiumDriver.findElement(MobileBy.xpath("//*[@text='OK']")).click();


            //Debug
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        appiumDriver.quit();
    }
}
