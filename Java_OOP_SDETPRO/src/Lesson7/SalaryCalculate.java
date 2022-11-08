package Lesson7;

import java.util.Scanner;

public class SalaryCalculate {
    public static void main(String[] args) {
        boolean result = true;
        while (result) {
            int FTE, Contractor;
            FTE FullTimeEmployee = new FTE();
            Contractor ConTractor = new Contractor();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter total of Full-time employee: ");
            FTE = scanner.nextInt();
            System.out.println("Enter total of Contractor employee: ");
            Contractor = scanner.nextInt();
            int totalEmployee = FTE + Contractor;
            int totalMonthSalary = (FTE * FullTimeEmployee.salary()) + (Contractor * ConTractor.salary());
            if (totalEmployee > 1) {
                System.out.println("Salary of Full-time employee is: " + FullTimeEmployee.salary());
                System.out.println("Salary of Contractor employee is: " + ConTractor.salary());
                System.out.println("Total of full-time employee is: " + FTE);
                System.out.println("Total of contractor employee is: " + Contractor);
                System.out.println("--->Salary company must pay for " + totalEmployee + " employees in this month is: " + totalMonthSalary);
                break;
            }
            else if (totalEmployee == 1) {
                System.out.println("Salary of FTE is: " + FullTimeEmployee.salary());
                System.out.println("Salary of Contractor is: " + ConTractor.salary());
                System.out.println("Total of full-time employee is: " + FTE);
                System.out.println("Total of contractor employee is: " + Contractor);
                System.out.println("--->Salary company must pay for " + totalEmployee + " employee in this month is: " + totalMonthSalary);
                break;
            }
            else {
                System.out.println("--->Error!!! Please try again");
            }
        }
    }
}
