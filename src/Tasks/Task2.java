package Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create an array of integer values. After the array is
        created, calculate the sum of all stored elements in
        that array
        */
        Scanner scan = new Scanner(System.in);
        // get the size of the array from the user
        System.out.println("Please enter the size of the array: ");
        int size = scan.nextInt();
        int [] array = new int[size];
        //get the elements of the array from the user
        System.out.println("Please enter the elements of the array: ");
        for(int i=0; i<array.length; i++){
            array[i]= scan.nextInt();
        }
        // initial sum set to zero
        int sum=0;
        // traverse the array and sum all the elements
        for (int element: array){

            sum = sum+element;
        }
        // print out the sum of all the elements
        System.out.println("Sum of all the elements of the array is : "+sum);

    }
}
