package class24;

import java.util.LinkedList;
import java.util.List;

public class E16ArrayList {
    public static void main(String[] args) {
        //51221
        // 219
        long start = System.currentTimeMillis();
        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
