package src.test_flow.authentication;

public class Verifier {
    public static void equals(String actualStr, String expectedStr){
        if(!actualStr.equalsIgnoreCase(expectedStr)){
            throw new RuntimeException("....");
        }
    }
    public static void equals(int num1, int num2){
        if(num1 == num2){
            throw new RuntimeException("....");
        }
    }
}
