package Tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        Write a program to swap 2 numbers without a
        temporary variable?
         */

        Scanner scan = new Scanner(System.in);
        // get the numbers from the user
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();

        // swapping the number without the third number
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        // print out the swapped numbers
        System.out.println("The swapped numbers are: \nFirst number: "+ num1 + "\nSecond number: "+num2);
    }
}
