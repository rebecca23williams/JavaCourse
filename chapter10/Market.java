package chapter10;

public class Market {

    public static void main(String args[]){
        Fruit apple = new Apple();
        ((Apple) apple).removeSeeds();

        Apple apple1 = new Apple();
        apple1.removeSeeds();

        Banana banana = new Banana();
        banana.peel();
        banana.makeJuice();

        Fruit banana1 = new Banana();
        ((Banana) banana1).peel();

        squeeze(banana);
        squeeze(apple);
        squeeze(banana1);
        squeeze(apple1);

    }

    public static void squeeze(Fruit fruit){
        System.out.println("Squeezing for juice");
        fruit.makeJuice();
    }
}
