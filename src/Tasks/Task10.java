package Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /*
        Write a program to print out duplicate elements from
        an Array of Strings?
        */
        int size;
        Scanner scan = new Scanner(System.in);
//      We get the size from the user
        System.out.println("Please Enter the size of the array: ");
        size = scan.nextInt();
//      we get the elements from the user
        System.out.println("Please Enter the elements of the array: ");
        String [] array = new String[size];
        for(int i=0; i < array.length; i++){
            array[i]= scan.nextLine();
        }
//      check for duplicates and print
        System.out.println("Duplicate elements in the given array are: ");
        //Searches for duplicate element
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i].equals(array[j]))
                    System.out.println(array[j]);
            }
        }
    }
}
