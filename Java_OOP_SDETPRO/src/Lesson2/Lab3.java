package Lesson2;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        double weight, height, BMI;
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight(kg): ");
        weight = scanner.nextDouble();
        System.out.println("Please enter your height(m): ");
        height = scanner.nextDouble();
        BMI = weight / (height * height);
        System.out.println("Number of BMI: " + BMI);
        if (BMI < 18.5) {
            result = "You are Underweight";
            System.out.println(result);
            System.out.println("Need to increase weight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            result = "You are Normal weight";
            System.out.println(result);
            System.out.println("Very good");
        } else if (BMI >= 25 && BMI <= 29.9) {
            result = "You are Overweight";
            System.out.println(result);
            System.out.println("Need to decrease weight");
        } else {
            result = "You are Obesity";
            System.out.println(result);
            System.out.println("Need to decrease weight");
        }
    }
}
