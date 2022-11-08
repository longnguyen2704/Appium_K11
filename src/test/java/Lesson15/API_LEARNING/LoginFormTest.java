package Lesson15.API_LEARNING;

import Lesson15.driver.DriverFactory;
import Lesson15.driver.Platform;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginFormTest {
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

            //Verify Login dialog
            WebDriverWait wait = new WebDriverWait(appiumDriver, 10L);
            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("android:id/alertTitle")));

            //Print dialog content
            MobileElement loginDialogEle = appiumDriver.findElement(MobileBy.id("android:id/alertTitle"));
            System.out.println("Message: " + loginDialogEle.getText());

            //Debug
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.quit();
    }
}
