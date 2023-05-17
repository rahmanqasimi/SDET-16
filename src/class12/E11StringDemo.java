package class12;

public class E11StringDemo {
    public static void main(String[] args) {

        String name="Today is Saturday";
        System.out.println(name.indexOf('i'));
        System.out.println(name.indexOf('a'));
        // start searching from index 4
        System.out.println(name.indexOf('a',4));
    }
}
