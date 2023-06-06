package class25;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String>aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        LinkedHashSet<String> names=new LinkedHashSet<>(aList);
        System.out.println(names);
    }
}
