package Practice;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");
        String name = scan.next();
        char ch = name.charAt(0);
        System.out.println("word = "+ name);
        System.out.println("char = "+ch);

    }
}
