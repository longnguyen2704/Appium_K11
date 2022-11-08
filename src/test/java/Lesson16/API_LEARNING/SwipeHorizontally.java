package Lesson16;

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


public class SwipeHorizontally {
    public static void main(String[] args) {

        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);

        try {
            //Navigate to login form
            MobileElement formsButtonElement = appiumDriver.findElement(MobileBy.AccessibilityId("Swipe"));
            formsButtonElement.click();

            //Trick
            WebDriverWait wait = new WebDriverWait(appiumDriver, 5L);
            wait
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Swipe horizontal\")")));

            //Get Mobile screen
            Dimension windowSize = appiumDriver.manage().window().getSize();
            int screenHeight = windowSize.getHeight();
            int screenWidth = windowSize.getWidth();

            //Calculate Touch points
            int xStartPoint = 82 * screenWidth / 100;
            int xEndPoint = 18 * screenWidth / 100;
            int yStartPoint = 60 * screenHeight / 100;
            int yEndPoint = 60 * screenHeight / 100;

            //Convert point to coordinate
            PointOption startPoint = new PointOption<>().withCoordinates(xStartPoint, yStartPoint);
            PointOption endPoint = new PointOption<>().withCoordinates(xEndPoint, yEndPoint);

            //TouchAction
            TouchAction touchAction = new TouchAction(appiumDriver);
            final int MAX_SWIPE_TIME = 5;
            for (int i = 0; i < MAX_SWIPE_TIME; i++){
            touchAction
                    .press(startPoint).waitAction(new WaitOptions().withDuration(Duration.ofMillis(500)))
                    .moveTo(endPoint)
                    .release()
                    .perform();
            }

            //Debug
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.quit();
    }
}
