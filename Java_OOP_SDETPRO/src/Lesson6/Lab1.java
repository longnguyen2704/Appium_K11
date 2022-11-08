package Lesson6;

public class Lab1 {
    public static void main(String[] args) {
        String hours = "3hrs and 5 mins";
        int totalMin = calculatetotalMin(hours);
        System.out.println("Total minutes is: " + totalMin);
    }

    private static int calculatetotalMin(String hours) {
        int hoursIndex = hours.indexOf("hrs");
        int minuteIndex = hours.indexOf("mins");
        int hour = Integer.valueOf(hours.substring(0, hoursIndex));
        int minute = Integer.valueOf((hours.substring(minuteIndex-2, minuteIndex-1)));
        int total = (hour*60) + minute;
        return total;
    }
}
