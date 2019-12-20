package chapter3;

/* SWITCH
The user will enter their grade then, using a
switch statement, a message will print out saying
how they did.
 */

import java.util.Scanner;

public class GradeMessage {

    public static void main(String args[]){
        System.out.println("Enter your grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String message;

        switch (grade){
            case "A":
                message = "Excelent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder!";
                break;
            case "F":
                message = "Uh-oh!";
                break;
            default:
                message = "Error. Invalid grade.";
                break;
        }
        System.out.println(message);





    }
}
