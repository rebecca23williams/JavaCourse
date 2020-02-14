package chapter3;
/* LOGICAL OPERATORS
To qualify for a loan, salary must be at least
£30000 and employment must be at least 2 years.
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String args[]){

        int requiredSalary = 30000;
        int requireYearsWorked = 2;

        System.out.println("What is your salary?");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("How many years have you worked at this job?");
        double years = scanner.nextDouble();

        scanner.close();

        if(salary >= requiredSalary && years >= requireYearsWorked){
                System.out.println("Congrats! You qualify for the loan!");
        }
        else{
            System.out.println("You must be earning at least " + requiredSalary +
                    " to qualify for the loan.");
        }
}
}
