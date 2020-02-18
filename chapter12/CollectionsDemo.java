package chapter12;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo {

    public static void main(String[] args){
        setDemo();
    }

    public static void setDemo(){
        Set fruit = new HashSet();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Lemon");
        fruit.add("Apple");

        var i = fruit.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
