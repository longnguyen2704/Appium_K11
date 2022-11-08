package Lesson6;

public class Lab3 {
    public static void main(String[] args) {
        String myStr = "5004 minutes";
        int myString = getIntmyString(myStr);
        System.out.println("Integer string is: " + myString);
    }

    private static int getIntmyString(String myStr) {
        String myString = "";
        char[] myStrArr = myStr.toCharArray();
        for(char value: myStrArr){
            if(Character.isDigit(value)){
                myString = myString.concat(String.valueOf(value));

            }
        }
        return Integer.valueOf((myString));
    }
}
