package chapter2;

import java.util.Scanner;

public class madLibs {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a season");
        String season = scanner.next();

        System.out.println("Pick a whole number");
        int number = scanner.nextInt();

        System.out.println("Pick an adjective");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee");


    }
}
