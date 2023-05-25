package class23;

import java.util.ArrayList;

public class E3Collection {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Moncef"); //0
        names.add("Vlad");   //1
        names.add("Axel");   //2
        names.add("Adam");  // 3
        names.add("Marina");
        names.add("Farwa");

        names.remove("Axel");
        names.remove(2);

        System.out.println(names.indexOf("Marina"));
      //  names.clear();
        System.out.println(names);
        for (int i = 0; i <names.size() ; i++) {
            System.out.println(names.get(i));
        }

    }
}
