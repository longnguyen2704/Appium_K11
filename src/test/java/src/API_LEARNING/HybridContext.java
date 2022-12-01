package src.API_LEARNING;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import src.Contexts.Contexts;
import src.Contexts.WaitMoreThanOneContext;
import src.Driver.DriverFactory;

import java.util.ArrayList;
import java.util.List;

public class HybridContext {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);
        try {
            //Navigate to webview
            appiumDriver.findElement(MobileBy.AccessibilityId("Webview")).click();

            //Wait for more than one Context
            WebDriverWait wait = new WebDriverWait(appiumDriver, 5L);
            wait.until(new WaitMoreThanOneContext(appiumDriver));

            //Print all available contexts
            for (String contextHandle : appiumDriver.getContextHandles()) {
                System.out.println("Context:" + contextHandle);

            }

            //Switch Webview context
            appiumDriver.context(Contexts.WEB_VIEW);
            WebElement navToggleBtnElems = appiumDriver.findElementByCssSelector(".navbar__toggle");
            navToggleBtnElems.click();
            List<MobileElement> menuItemElems = appiumDriver.findElementsByCssSelector(".menu__list li a");
            if (menuItemElems.isEmpty())
                throw new RuntimeException("[ERR] There is no list. Try again!!!");
            List<MenuItemData> menuItemDataList = new ArrayList<>();
            for (MobileElement menuItemElem : menuItemElems) {
                String itemText = menuItemElem.getText();
                String itemHref = menuItemElem.getAttribute("href");
                if (itemText.isEmpty()) {
                    menuItemDataList.add(new MenuItemData("Github", itemHref));
                } else {
                    menuItemDataList.add(new MenuItemData(itemText, itemHref));
                }
            }
            List<MenuItemData> expectedMenuItemList = new ArrayList<>();
            System.out.println(menuItemDataList);

            //Switch back to Native context
            appiumDriver.context(Contexts.NATIVE);
            appiumDriver.findElement(MobileBy.AccessibilityId("Home")).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.quit();
    }

    public static class MenuItemData {
        private final String name;
        private final String herf;

        public MenuItemData(String name, String herf) {
            this.name = name;
            this.herf = herf;
        }

        public String getName() {
            return name;
        }

        public String getHerf() {
            return herf;
        }

        @Override
        public String toString() {
            return "MenuItemData{" +
                    "name='" + name + '\'' +
                    ", herf='" + herf + '\'' +
                    '}';
        }
    }
}
