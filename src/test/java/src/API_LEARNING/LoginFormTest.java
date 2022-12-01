package src.API_LEARNING;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Platform;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import src.Driver.DriverFactory;


public class LoginFormTest {

    public static void main(String[] args) {

        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);

        try {
            // Navigate to login form
            MobileElement navLoginBtnElem = appiumDriver.findElement(MobileBy.AccessibilityId("Login"));
            navLoginBtnElem.click();

            // Find Login form elements
            MobileElement emailInputElem = appiumDriver.findElement(MobileBy.AccessibilityId("input-email"));
            MobileElement passwordInputElem = appiumDriver.findElement(MobileBy.AccessibilityId("input-password"));
            MobileElement loginBtnElem = appiumDriver.findElement(MobileBy.AccessibilityId("button-LOGIN"));

            // Interact with login form | fill username and password
            emailInputElem.sendKeys("teo@sth.com");
            passwordInputElem.sendKeys("12345678");
            loginBtnElem.click();

            // Verification | Login Dialog
            WebDriverWait wait = new WebDriverWait(appiumDriver, 10L);
            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("android:id/alertTitle")));

            MobileElement loginDialogTitleElem = appiumDriver.findElement(MobileBy.id("android:id/alertTitle"));
            System.out.println("Dialog Title: " + loginDialogTitleElem.getText());

        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.quit();
    }
}
