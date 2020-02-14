package chapter4;

/* FOR LOOP
Write a program that lets a cashier scan a
given number of items and tally the cost.
 */

import java.util.Scanner;

public class Cashier {

    public static void main(String args[]){

        System.out.println("How many items would you like to scan?");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        //i is the sentinel
        for(int i=0; i < quantity; i++){
            System.out.println("Enter the cost of the item:");
            double cost = scanner.nextInt();

            total = total + cost;
        }
        scanner.close();
        System.out.println("Your total is " + total);

    }
}
