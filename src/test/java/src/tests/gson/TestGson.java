package src.tests.gson;

import src.test_data.Models.LoginCred;
import src.test_data.Utils.DataObjectBuilder;

import java.util.Arrays;
import java.util.List;

public class TestGson {
    public static void main(String[] args) {
        // From Json to Object
        String fileLocation = "/src/test/java/src/tests/gson/login.json";
        List<LoginCred> loginCreds = Arrays.asList(DataObjectBuilder.buildDataObject(fileLocation, LoginCred[].class));

        for (LoginCred loginCred : loginCreds) {
            System.out.println(loginCred);
        }
    }
}
