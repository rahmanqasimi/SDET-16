package class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Farwa");
        names.add("Farwa");
        System.out.println(names.get(0));

        // HashSet does not allow duplicates and does not remember the insertions order
        HashSet<String> uniqNames=new HashSet<>();
        uniqNames.add("FF");
        uniqNames.add("BB");
        uniqNames.add("AA");
        //There is no get method in sets uniqNames.get(0)
       // System.out.println(uniqNames);
        for(String name:uniqNames){
            System.out.println(name);
        }
    }
}
