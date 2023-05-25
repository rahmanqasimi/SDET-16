package Practice2;

import java.util.ArrayList;

public class P5 {
    public static void main(String[] args) {
/*        Integer i = new Integer(10);
        Integer int1 = 10;
        System.out.println(i);
        System.out.println(int1);
        */

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("JOhn");
        arrayList.add("Doe");
        arrayList.add("Jane");
        arrayList.add("Jill");
        arrayList.add("June");
        arrayList.add("J");

        System.out.println(arrayList.contains("John"));


    }
}
