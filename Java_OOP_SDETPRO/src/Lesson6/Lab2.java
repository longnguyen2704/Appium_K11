package Lesson6;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        String password = "Kikilala159";
        boolean results = comparePassword(password);
        if(results == true){
            System.out.println("Welcome to my home!!!");
        }
        else{
            System.out.println("Good bye!!!");
        }
    }

    private static boolean comparePassword(String password) {
        boolean results = false;
        int count = 1;
        while (count <= 3){
            System.out.println("Enter your password: ");
            Scanner scanner = new Scanner(System.in);
            String myPassword = scanner.nextLine();
            if(myPassword.equals(password)){
                results = true;
                return true;
            }
            if(count == 1){
                System.out.println("Wrong password. Please try again.");
            }
            if(count == 2){
                System.out.println("Wrong password. Please try again.");
            }
            if(count == 3){
                System.out.println("Wrong password 3 times. Please try again tomorrow");
                break;
            }
            count++;
        }
        return results;
    }
}
