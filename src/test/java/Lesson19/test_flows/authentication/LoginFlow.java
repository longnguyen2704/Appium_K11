package Lesson19.test_flows.authentication;

import Lesson18.Models.Components.Login.LoginFormComponentMode03;
import Lesson18.Models.Pages.LoginScreenMode03;
import Lesson19.test_flows.BaseFlow;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.commons.validator.routines.EmailValidator;

public class LoginFlow extends BaseFlow {

    private String username;
    private String password;

    public LoginFlow(AppiumDriver<MobileElement>appiumDriver, String username, String password){
        super(appiumDriver);
        this.username = username;
        this.password = password;
    }

    public void login(){
        LoginScreenMode03 loginScreen = new LoginScreenMode03(this.appiumDriver);
        LoginFormComponentMode03 loginFormComp = loginScreen.loginFromComp();

        if(!username.isEmpty()) loginFormComp.inputUserName(username);
        if(!username.isEmpty()) loginFormComp.inputPassword(password);
        loginFormComp.clickOnLoginBtn();
    }
    public void  verifyLogin(){
        boolean isEmailValid = isEmailValid(username);
        boolean isPasswordValid = isPassWordValid();

        LoginFormComponentMode03 loginFormComp = new LoginScreenMode03(appiumDriver).loginFromComp();
        if (isEmailValid && isPasswordValid){
            verifyCorrectLoginCreds();
        }
        if(!isEmailValid){
            verifyIncorrectEmailLogin(loginFormComp);
        }
        if(!isPasswordValid){
            verifyIncorrectPasswordLogin(loginFormComp);
        }
    }

    private boolean isEmailValid(String username) {
        return EmailValidator.getInstance().isValid(username);
    }

    private boolean isPassWordValid() {
        return password.length() >= 8;
    }

    private void verifyCorrectLoginCreds() {
        //TODO: homework
    }

    private void verifyIncorrectPasswordLogin(LoginFormComponentMode03 loginFormComp) {
        String actualInvalidEmailTxt = loginFormComp.invalidEmailTxt();
        String expectedInvalidEmailTxt = "Please enter a valid email address";

        System.out.println("actualInvalidEmailTxt: " + actualInvalidEmailTxt);
        System.out.println("expectedInvalidEmailTxt: " + expectedInvalidEmailTxt);
    }

    private void verifyIncorrectEmailLogin(LoginFormComponentMode03 loginFormComp) {
        String actualInvalidPasswordTxt = loginFormComp.invalidPasswordTxt();
        String expectedInvalidPasswordTxt = "Please enter a valid email address";

        System.out.println("actualInvalidPasswordTxt: " + actualInvalidPasswordTxt);
        System.out.println("expectedInvalidPasswordTxt: " + expectedInvalidPasswordTxt);
    }
}
