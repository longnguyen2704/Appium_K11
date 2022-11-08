package Lesson16.API_LEARNING;

import Lesson16.driver.DriverFactory;
import Lesson16.driver.Platform;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import java.util.List;


public class XpathLearning {
    public static void main(String[] args) {

        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);

        try {
            //Navigate to login form
            MobileElement loginButtonElement = appiumDriver.findElement(MobileBy.AccessibilityId("Login"));
            loginButtonElement.click();

            //Find all matching elems | Sharing about the trick with findElems
            List<MobileElement> credFieldElem = appiumDriver.findElements(MobileBy.xpath("//android.widget.EditText"));
            final int USERNAME_INDEX = 0;
            final int PASSWORD_INDEX = 1;
            credFieldElem.get(USERNAME_INDEX).sendKeys("minhlonghades123@gmail.com");
            credFieldElem.get(PASSWORD_INDEX).sendKeys("Kikilala159");

            //Find login info text by UiSelector
            MobileElement loginInstructionElem =
                appiumDriver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"When the device\")"));
            System.out.println(loginInstructionElem.getText());

            //Debug
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.quit();
    }
}
