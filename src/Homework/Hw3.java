package Homework;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.nextLine();
        HW2 obj = new HW2();
        String revWord = obj.reverse(word);
        if(word.toLowerCase().equals(revWord.toLowerCase())){
            System.out.println("The word is Palindrome");
        }
        else {
            System.out.println(" The word is not Palindrome");
        }
    }
}
