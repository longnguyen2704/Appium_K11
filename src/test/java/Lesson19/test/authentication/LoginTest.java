package Lesson19.test.authentication;

import Lesson19.driver.DriverFactory;
import Lesson19.driver.Platform;
import Lesson19.test_data.models.LoginCred;
import Lesson19.test_flows.authentication.LoginFlow;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LoginTest {

    @Test
    public void testLogin() {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);
        List<LoginCred> loginCredsData = new ArrayList<>();
        // Null email - Null password
        loginCredsData.add(new LoginCred("", ""));

        // Correct email - Incorrect password
        loginCredsData.add(new LoginCred("minhlonghades123@gmail.com", "kikilala"));

        // Incorrect email - Correct password
        loginCredsData.add(new LoginCred("minhlonghades123@", "Kikilala159"));

        // Correct email - Correct password
        loginCredsData.add(new LoginCred("minhlonghades123@gmail.com", "Kikilala159"));


        try {
            for (LoginCred loginCred : loginCredsData) {
                String username = loginCred.getUsername();
                String password = loginCred.getPassword();
                LoginFlow loginFlow
                        = new LoginFlow(appiumDriver, username, password);
                loginFlow.goToLoginScreen();
                loginFlow.login();
                loginFlow.verifyLogin();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.quit();
    }
}
