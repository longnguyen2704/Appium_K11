package src.tests.authen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Platform;
import org.testng.annotations.Test;
import src.Driver.DriverFactory;
import src.test_data.Models.LoginCred;
import src.test_flow.authentication.LoginFlow;

import java.util.ArrayList;
import java.util.List;

public class LoginTest {
    @Test
    public void testLogin() {
    AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);
    try {
        for (LoginCred loginCred : loginCredDataSet()) {
            String username = loginCred.getUsername();
            String password = loginCred.getPassword();
            LoginFlow loginFlow = new LoginFlow(appiumDriver, username, password);
            loginFlow.gotoLoginScreen();
            loginFlow.login();
            loginFlow.verifyLogin();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    appiumDriver.quit();
}

    private List<LoginCred> loginCredDataSet(){
        List<LoginCred> loginCredsData = new ArrayList<>();
        loginCredsData.add(new LoginCred("", ""));
        loginCredsData.add(new LoginCred("teo@sth.com", "1234567"));
        loginCredsData.add(new LoginCred("teo@", "12345678"));
        loginCredsData.add(new LoginCred("teo@sth.com", "12345678"));
        return loginCredsData;
    }
}
