package Lesson8.People;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    public int totalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee fte = new FTE();
        Employee contractor = new Contractor();
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
            int totalMonthSalary = (FTE * FullTimeEmployee.getSalary()) + (Contractor * ConTractor.getSalary());
            if (totalEmployee > 1) {
                System.out.println("Salary of Full-time employee is: " + FullTimeEmployee.getSalary());
                System.out.println("Salary of Contractor employee is: " + ConTractor.getSalary());
                System.out.println("Total of full-time employee is: " + FTE);
                System.out.println("Total of contractor employee is: " + Contractor);
                System.out.println("--->Salary company must pay for " + totalEmployee + " employees in this month is: " + totalMonthSalary);
                break;
            } else if (totalEmployee == 1) {
                System.out.println("Salary of FTE is: " + FullTimeEmployee.getSalary());
                System.out.println("Salary of Contractor is: " + ConTractor.getSalary());
                System.out.println("Total of full-time employee is: " + FTE);
                System.out.println("Total of contractor employee is: " + Contractor);
                System.out.println("--->Salary company must pay for " + totalEmployee + " employee in this month is: " + totalMonthSalary);
                break;
            } else {
                System.out.println("--->Error!!! Please try again");
            }
        }
    }
}