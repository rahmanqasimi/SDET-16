package class25;

import java.util.LinkedHashSet;

public class E4Sets {
    public static void main(String[] args) {
    //no duplicates but it will remember the order
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Apple");
        System.out.println(fruit);
    }
}
