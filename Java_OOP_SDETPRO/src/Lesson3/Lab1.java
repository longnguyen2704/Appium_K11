package Lesson3;

public class Lab1 {
    public static void main(String[] args) {
        int[] myNumArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 54, 85, 78, 100, 120, 354, 995};
        int TotalcountOdd = 0; // 0 là cột mốc
        int TotalcountEven = 0;
        for (int value : myNumArray) {
            if (value % 2 == 0) {
                TotalcountEven++;
            } else TotalcountOdd++;
        }
        System.out.println("Total Even is: " + TotalcountEven);
        System.out.println("Total Odd is: " + TotalcountOdd);
    }
}
