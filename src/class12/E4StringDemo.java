package class12;

public class E4StringDemo {
    public static void main(String[] args) {

        String firstName="Ana";
        String lastName=" Farwa";

        String fullName=firstName+lastName; // Most widely used approach
        System.out.println(fullName);
        System.out.println(firstName.concat(lastName));
    }
}
