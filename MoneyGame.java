package chapter3;

import java.util.Scanner;

public class MoneyGame {

    public static void main(String args[]){

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

       System.out.println("Welcome to change for a dollar!" +
               "Your goal is to enter enough change to make up one dollar!");

       System.out.println("How many pennies would you like?");
       double numOfPennies = scanner.nextDouble();

       System.out.println("How many nickles would you like?");
       double numOfNickels = scanner.nextDouble();

       System.out.println("How many dimes would you like?");
       double numOfDimes = scanner.nextDouble();

        System.out.println("How many quarters would you like?");
        double numOfQuarters = scanner.nextDouble();
        scanner.close();

        double total = numOfPennies * penny + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;

        if(total < dollar){
            double amountShort = dollar - total;
            System.out.println("Sorry, you lose! You were short by " + String.format("%.2f", amountShort) + " cents.");
        }
        else if(total > dollar){
            double amountOver = dollar + total;
            System.out.println("Sorry you lose! You were over by " + String.format("%.2f", amountOver) + " cents");
        }
        else{
            System.out.println("Your total equals one dollar! You win!");
        }

    }
}
