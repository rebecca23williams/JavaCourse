package chapter4;

/* WHILE LOOP
Write a program that allows managers to enter the
number of hours an employee has worked, and calculate
their pay. Do not include overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String args[]){

        int rate = 15;
        int maxHours = 40;

        System.out.println("Enter the amount of hours you have worked this week:");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. You hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        double grossPay = hoursWorked * rate;
        System.out.println("Your gross pay is £ " + grossPay);

    }
}
