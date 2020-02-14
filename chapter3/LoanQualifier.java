package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String args[]){

        int requiredSalary = 30000;
        int requireYearsWorked = 2;

        System.out.println("What is your salary?");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("How many years have you worked at this job?");
        double years = scanner.nextDouble();

        scanner.close();

        if(salary >= requiredSalary){
            if(years >= requireYearsWorked){
                System.out.println("Congrats! You qualify for the loan!");
            }
            else{
                System.out.println("Sorry, you need to have worked at your " +
                        "current job for " + requireYearsWorked + " years.");
        }
    }
        else{
            System.out.println("You must be earning at least " + requiredSalary
                    + " to qualify for the loan.");
        }
}
}
