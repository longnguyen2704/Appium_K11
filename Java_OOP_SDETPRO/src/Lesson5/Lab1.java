package Lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        // Create a simple menu with 4 options:
        // ====Menu====
        // 1. Add number into ArrayList
        // 2. Print numbers
        // 3. Get maximum number
        // 4. Get minimum number
        List<Integer> myList = new ArrayList<>();
        boolean out = true;
        while (out) {
            System.out.println("\n=====MENU=====");
            printMenu();
            int optional = enterNumber();

            switch (optional) {
                case 1:
                    addArray(myList);
                    break;
                case 2:
                    printNumbers(myList);
                    break;
                case 3:
                    getMaximumNumber(myList);
                    break;
                case 4:
                    getMinimumNumber(myList);
                    break;
                case 5:
                    searchNumber(myList);
                    break;
                case 6:
                    out = false;
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Please choose number between 1 - 6. Try again!!!");
            }
        }
    }

    public static void printMenu() {
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");
        System.out.println("6. Exit");
        System.out.println("Please choose the menu");
    }

    public static int enterNumber() {
        System.out.print("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printNumbers(List<Integer> myList) {
        checkNull(myList);
        System.out.println("Your arrayList is: ");
        for (Integer value : myList) {
            System.out.println(" " + value);
        }
    }

    public static void addArray(List<Integer> myList) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter length of list: ");
        int size = scanner.nextInt();
        if (size == 0) {
            System.out.println("List is empty");
        } else {
            System.out.printf("Enter element of list: \n");
            for (int i = 0; i < size; i++) {
                myList.add(scanner.nextInt());
            }
        }
    }

    public static void getMaximumNumber(List<Integer> myList) {
        int maxNumber = myList.get(0);
        for (int index = 1; index < myList.size(); index++) {
            if (myList.get(index) > maxNumber) {
                maxNumber = myList.get(index);
            }
        }
        System.out.printf("The maximum number in list is  %d.\n", maxNumber);
    }

    public static void getMinimumNumber(List<Integer> myList) {
        int minNumber = myList.get(0);
        for (int index = 1; index < myList.size(); index++) {
            if (myList.get(index) < minNumber) {
                minNumber = myList.get(index);
            }
        }
        System.out.printf("The minimum number in list is %d.\n", minNumber);
    }

    public static boolean checkNull(List<Integer> myList) {
        if (myList.isEmpty()) {
            System.out.println("List is empty, please try again!!!");
            addArray(myList);
            return false;
        }
        return true;
    }

    public static void searchNumber(List<Integer> myList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number want to search: ");
        int searchNum = scanner.nextInt();
        int index = myList.indexOf(searchNum);
        if (myList.isEmpty()){
            System.out.println("Array list is empty, please try again!!!");
        }
        else if (index < 0){
            System.out.println(searchNum + " is not found in your array");
        }
        for(int i = 0; i < myList.size(); i++){
            if(searchNum == myList.get(i)){
                System.out.println(searchNum + " is found in your array");
            }
        }
    }
}
