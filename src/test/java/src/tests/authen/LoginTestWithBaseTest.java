package src.tests.authen;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import src.test_data.Models.LoginCred;
import src.test_data.Utils.DataObjectBuilder;
import src.test_flow.authentication.LoginFlow;
import src.tests.BaseTest;

public class LoginTestWithBaseTest extends BaseTest {

    @Test(dataProvider = "loginData")
    public void testLogin(LoginCred loginCred) {
        String username = loginCred.getUsername();
        String password = loginCred.getPassword();
        LoginFlow loginFlow = new LoginFlow(getDriver(), username, password);
        loginFlow.gotoLoginScreen();
        loginFlow.login();
        loginFlow.verifyLogin();
    }

    @DataProvider(name = "loginData")
    private LoginCred[] loginCredDataSet() {
        String fileLocation = "/src/test/java/src/tests/gson/login.json";
        return DataObjectBuilder.buildDataObject(fileLocation, LoginCred[].class);
    }
}
