package chapter10;

public class Banana extends Fruit {

    public Banana(){
        setCalories(20);
    }

    public void peel(){
        System.out.println("Banana is peeled");
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana juice is not nice");
    }
}
