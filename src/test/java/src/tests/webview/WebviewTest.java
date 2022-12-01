package src.tests.webview;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import src.Contexts.Contexts;
import src.Contexts.WaitMoreThanOneContext;
import src.tests.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class WebviewTest extends BaseTest {
    @Test
    public void testWebview() {
        AppiumDriver<MobileElement> appiumDriver = getDriver();
        // Navigate to webview
        appiumDriver.findElement(MobileBy.AccessibilityId("Webview")).click();

        // Wait for more than one context
        WebDriverWait wait = new WebDriverWait(appiumDriver, 5L);
        wait.until(new WaitMoreThanOneContext(appiumDriver));

        // Print all available contexts
        for (String contextHandle : appiumDriver.getContextHandles()) {
            System.out.println("Context: " + contextHandle);
        }

        // Switch Webview context
        appiumDriver.context(Contexts.WEB_VIEW);
        WebElement navToggleBtnElem = appiumDriver.findElementByCssSelector(".navbar__toggle");
        navToggleBtnElem.click();
        List<MobileElement> menuItemsElem = appiumDriver.findElementsByCssSelector(".menu__list li a");
        if (menuItemsElem.isEmpty())
            throw new RuntimeException("[ERR] There is no list items to test!");
        List<MenuItemData> menuItemDataList = new ArrayList<>();
        for (MobileElement menuItemElem : menuItemsElem) {
            String itemText = menuItemElem.getText();
            String itemHref = menuItemElem.getAttribute("href");
            if (itemText.isEmpty()) {
                menuItemDataList.add(new MenuItemData("Github", itemHref));
            } else {
                menuItemDataList.add(new MenuItemData(itemText, itemHref));
            }
        }

        System.out.println(menuItemDataList);

        // Switch back to Native context
        appiumDriver.context(Contexts.NATIVE);
        appiumDriver.findElement(MobileBy.AccessibilityId("Home")).click();

    }

    public static class MenuItemData {
        private final String name;
        private final String href;

        public MenuItemData(String name, String href) {
            this.name = name;
            this.href = href;
        }

        public String getName() {
            return name;
        }

        public String getHref() {
            return href;
        }

        @Override
        public String toString() {
            return "MenuItemData{" +
                    "name='" + name + '\'' +
                    ", href='" + href + '\'' +
                    '}';
        }
    }
}
