package src.test_flow.authentication;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.commons.validator.routines.EmailValidator;
import org.testng.Assert;
import src.Models.Components.Login.LoginFormComponentMod03;
import src.Models.Pages.LoginScreenMod03;
import src.test_flow.BaseFlow;

public class LoginFlow extends BaseFlow {

    private String username;
    private String password;

    public LoginFlow(AppiumDriver<MobileElement> appiumDriver, String username, String password) {
        super(appiumDriver);
        this.username = username;
        this.password = password;
    }

    public void login(){
        LoginScreenMod03 loginScreen = new LoginScreenMod03(appiumDriver);
        LoginFormComponentMod03 loginFormComp = loginScreen.loginFormComp();
        if(!username.isEmpty()) loginFormComp.inputUsername(username);
        if(!password.isEmpty()) loginFormComp.inputPassword(password);
        loginFormComp.clickOnLoginBtn();
    }

    public void verifyLogin(){

        boolean isEmailValid = isEmailValid();
        boolean isPasswordValid = isPasswordValid();
        LoginFormComponentMod03 loginFormComp = new LoginScreenMod03(appiumDriver).loginFormComp();

        if(isEmailValid && isPasswordValid){
            verifyCorrectLoginCreds();
        }

        if(!isEmailValid){
            verifyIncorrectEmailLogin(loginFormComp);
        }

        if(!isPasswordValid){
            verifyIncorrectPasswordLogin(loginFormComp);
        }

    }

    private boolean isEmailValid() {
        return EmailValidator.getInstance().isValid(username);
    }

    private boolean isPasswordValid() {
        return password.length() >=8;
    }

    private void verifyCorrectLoginCreds() {
        // TODO: homework
    }

    private void verifyIncorrectEmailLogin(LoginFormComponentMod03 loginFormComp) {
        String actualInvalidEmailTxt = loginFormComp.invalidEmailTxt();
        String expectedInvalidEmailTxt = "Please enter a valid email address";

        System.out.println("actualInvalidEmailTxt: " + actualInvalidEmailTxt);
        System.out.println("expectedInvalidEmailTxt: " + expectedInvalidEmailTxt);
//        Assert.assertTrue(actualInvalidEmailTxt.equalsIgnoreCase(expectedInvalidEmailTxt), "[ERR] ....");
        Assert.assertEquals(actualInvalidEmailTxt, expectedInvalidEmailTxt, "[ERR] optional err msg....");
    }

    private void verifyIncorrectPasswordLogin(LoginFormComponentMod03 loginFormComp) {
        String actualInvalidPasswordTxt = loginFormComp.invalidPasswordTxt();
        String expectedInvalidPasswordTxt = "Please enter at least 8 characters";

        System.out.println("actualInvalidPasswordTxt: " + actualInvalidPasswordTxt);
        System.out.println("expectedInvalidPasswordTxt: " + expectedInvalidPasswordTxt);
    }
}
