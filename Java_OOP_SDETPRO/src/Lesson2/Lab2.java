package Lesson2;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number need to check: ");
        n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " - This is an odd number");
        } else {
            System.out.println(n + " - This is an even number");
        }
    }
}
