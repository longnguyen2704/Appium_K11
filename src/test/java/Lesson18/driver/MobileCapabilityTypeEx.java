package Lesson18.driver;

import io.appium.java_client.remote.MobileCapabilityType;

public interface MobileCapabilityTypeEx extends MobileCapabilityType {
    String PLATFORM_NAME = "platform";
    String APP_PACKAGE = "appPackage";
    String APP_ACTIVITY = "appActivity";

}
