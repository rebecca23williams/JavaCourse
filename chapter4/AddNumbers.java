package chapter4;

/* DO WHILE LOOP
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */

import java.util.Scanner;

public class AddNumbers {

    public static void main(String args[]){

        boolean again;

        do {
            System.out.println("Enter your first number:");
            Scanner scanner = new Scanner(System.in);
            int firstNum = scanner.nextInt();

            System.out.println("Enter your second number:");
            int secondNum = scanner.nextInt();

            int total = firstNum + secondNum;

            System.out.println("The total is " + total);

            System.out.println("Would you like to start over? Type True or False");
            again = scanner.nextBoolean();

        } while (again);
    }
}
