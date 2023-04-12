package Practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first name");
        String fName= scan.nextLine();
        System.out.println("What is your last name");
        String lName= scan.nextLine();
        System.out.println("How old are you?");
        int age=scan.nextInt();

        System.out.println("Hello, "+ fName +" "+ lName+", You are "+ age+ " years old.");


    }
}
