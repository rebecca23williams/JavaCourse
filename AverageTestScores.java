package chapter4;

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String ags[]){

        int students = 24;
        int tests = 4;

        for(int i = 0; i < students; i++){

            double total = 0;
            for(int j = 0; j < tests; j++){
                System.out.println("Enter your score for test number " + (j+1));
                Scanner scanner = new Scanner(System.in);
                double score = scanner.nextDouble();
                total = total + score;
            }
        }
    }
}
