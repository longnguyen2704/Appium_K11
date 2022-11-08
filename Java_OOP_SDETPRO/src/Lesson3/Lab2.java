package Lesson3;

public class Lab2 {
    public static void main(String[] args) {
        int myNumArray[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 54, 85, 78, 100, 120, 354, 995};
        int ValueMax = myNumArray[0];
        int ValueMin = myNumArray[0];
        for (int value : myNumArray) {
            if (value > ValueMax) {
                ValueMax = value;
            } else if (value < ValueMin) {
                ValueMin = value;
            }
        }
        System.out.println("Max value is: " + ValueMax);
        System.out.println("Min value is: " + ValueMin);
    }
}