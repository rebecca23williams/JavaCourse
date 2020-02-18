package chapter11;

public class Farm {

    public static void main(String[] args){
        Animal daffy = new Duck();
        daffy.makeSound();

        Duck donald = new Duck();
        daffy.makeSound();

        Pig peppa = new Pig();
        peppa.makeSound();
}
}
