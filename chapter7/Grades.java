package chapter7;

import java.util.Scanner;

/*
 * Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 */

public class Grades {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        System.out.print("How many grades would you like to enter?");
        //Initialise grades with the length that the user enters.
        grades = new int[scanner.nextInt()];
        getGrades();
        System.out.print("Average: " + String.format("%.2f", calculateAverage()));
        System.out.print("Highest: " + getHighestNumber());
        System.out.print(("Lowest: " + getLowestNumber()));
    }
    public static void getGrades(){
        //.length gets how big the array is.
        for(int i = 0; i<grades.length; i++){
            System.out.print("Enter grade #" + (i+1));
            grades[i] = scanner.nextInt();
        }
    }
    public static int calculateSum(){
        int sum = 0;
        for(int grade : grades){
            sum = sum + grade;
        }
        return sum;
    }
    public static double calculateAverage(){
        return calculateSum()/grades.length;
    }
    public static int getHighestNumber(){
        //Make the highest number equal to the first thing in the array.
        int highest = grades[0];
        for(int grade : grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }
    public static int getLowestNumber(){
        int lowest = grades[0];
        for(int grade : grades){
            if(grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }

}
