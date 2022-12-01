package src.tests.authen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Platform;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import src.Driver.DriverFactory;
import src.test_data.Models.LoginCred;
import src.test_data.Utils.DataObjectBuilder;
import src.test_flow.authentication.LoginFlow;

public class LoginTestWithDataProvider {
    @Test(dataProvider = "loginData")
    public void testLogin(LoginCred loginCred) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platform.ANDROID);
        try {
            String username = loginCred.getUsername();
            String password = loginCred.getPassword();
            LoginFlow loginFlow = new LoginFlow(appiumDriver, username, password);
            loginFlow.gotoLoginScreen();
            loginFlow.login();
            loginFlow.verifyLogin();
        } catch (Exception e) {
            e.printStackTrace();
        }
        appiumDriver.quit();
    }

    @DataProvider(name = "loginData")
    private LoginCred[] loginCredDataSet() {
        String fileLocation = "/src/test/java/src/tests/gson/login.json";
        return DataObjectBuilder.buildDataObject(fileLocation, LoginCred[].class);
    }
}
