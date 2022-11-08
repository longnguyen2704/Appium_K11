package Lesson16.API_LEARNING;

import Lesson16.driver.DriverFactory;
import Lesson16.driver.Platform;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SwipeVertically {
    public static void main(String[] args) {

        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);

        try {
            //Navigate to login form
            MobileElement formsButtonElement = appiumDriver.findElement(MobileBy.AccessibilityId("Forms"));
            formsButtonElement.click();

            //Trick
            WebDriverWait wait = new WebDriverWait(appiumDriver, 5L);
            wait
                    .until(ExpectedConditions
                    .visibilityOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Form Components\")")));

            //Get Mobile screen
            Dimension windowSize = appiumDriver.manage().window().getSize();
            int screenHeight = windowSize.getHeight();
            int screenWidth = windowSize.getWidth();

            //Calculate Touch points
            int xStartPoint = 50 * screenWidth / 100;
            int xEndPoint = 50 * screenWidth / 100;
            int yStartPoint = 50 * screenHeight / 100;
            int yEndPoint = 10 * screenHeight / 100;

            //Convert point to coordinate
            PointOption startPoint = new PointOption<>().withCoordinates(xStartPoint, yStartPoint);
            PointOption endPoint = new PointOption<>().withCoordinates(xEndPoint, yEndPoint);

            //TouchAction
            TouchAction touchAction = new TouchAction(appiumDriver);
            touchAction
                    .press(startPoint).waitAction(new WaitOptions().withDuration(Duration.ofMillis(500)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            //Find Active btn and click
            appiumDriver.findElement(MobileBy.AccessibilityId("button-Active")).click();

            //Debug
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.quit();
    }
}
