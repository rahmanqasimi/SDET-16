package Practice;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        /*
        Write a java program to find the second largest
        number in the array?
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
        int max = array[0];
        int second = array[0];
        for(int value: array){
            if(max<value)
            {
                max=value;
            }
        }
        for(int value: array) {
            if (second < value && value != max) {
                second = value;
            }
        }
        System.out.println("The max is: "+max);
        System.out.println("The second is: "+second);
        /*
        //sort the array by size, Ascending
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        // print the second last number on the array which is array length minus 2
        System.out.println("\nThe second largest number the array is: "+array[array.length-2]);
        */

    }
}
