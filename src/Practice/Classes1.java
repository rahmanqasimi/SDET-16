package Practice;

import java.util.Locale;

public class Classes1 {
    public static void main(String[] args) {

        String sent ="  Java is nice";
        String nope=sent.trim().toLowerCase();
        System.out.println(sent.trim().toLowerCase().startsWith("java"));
    }
}
