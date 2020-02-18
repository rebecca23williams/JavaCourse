package chapter10;

public class Zoo {

    public static void main(String args[]){
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal rambo = new Dog();
        rambo.makeSound();
        feed(rambo);

        rambo = new Cat();
        rambo.makeSound();
        ((Cat) rambo).scratch();
        feed(rambo);
    }

    public static void feed(Animal animal){
       if (animal instanceof Dog){
           System.out.println("here's your dog food");
       }

       if(animal instanceof Cat){
           System.out.println("here's your cat food");
       }


}}
