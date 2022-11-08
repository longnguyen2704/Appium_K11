package Lesson3;

public class Lab3 {
    public static void main(String[] args) {
        int myNumArray[] = new int[]{995, 2, 3, 4, 120, 6, 7, 8, 9, 10, 12, 54, 85, 78, 100, 5, 354, 1};
        for (int index = 0; index < myNumArray.length; index++) {
            for (int j = 0; j < myNumArray.length; j++){
                if (myNumArray[index] < myNumArray[j]){
                   int c = myNumArray[index];
                    myNumArray[index] = myNumArray[j];
                    myNumArray[j] = c;
                }
            }
        }
        for (int index : myNumArray) {
            System.out.println("Arrange Min to Max: " + index);

        }
    }
}
