package Lesson2;

import jdk.jshell.Snippet;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        double weight, height, BMI;
        String result = "";
        // Underweight: < 18.5
        // Normal weight: 18.5 - 24.9
        // Overweight: 25 - 29.9
        // Obesity: 30 or greater
        // BMI = weight / (height x 2)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight(kg): ");
        weight = scanner.nextDouble();
        System.out.println("Please enter your height(m): ");
        height = scanner.nextDouble();
        BMI = weight / (height * height);
        System.out.println("Number of BMI: " + BMI);
        if (BMI < 18.5) {
            result = "You are Underweight";
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            result = "You are Normal weight";
        } else if (BMI >= 25 && BMI <= 29.9) {
            result = "You are Overweight";
        } else {
            result = "You are Obesity";
        }
        System.out.println(result);
    }
}
