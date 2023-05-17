package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class C102DArray {
    public static void main(String[] args) {
        int [][] array = new int [3][4];
        Scanner scan = new Scanner(System.in);
        int element;
        System.out.println("Please Enter the numbers: ");
        for(int row = 0; row < array.length; row++){
            for(int col=0; col <array[row].length; col++){

                array[row][col] = scan.nextInt();
            }
        }
        System.out.print("The array is:");
        for(int row = 0; row < array.length; row++){
            System.out.println("");
            for(int col=0; col <array[row].length; col++){
                element = array[row][col];
                System.out.print(element+" ");
            }
        }
        System.out.print("\nOdd numbers are: ");
        for(int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                element = array[row][col];
                if (element % 2 != 0) {
                    System.out.print(element + " ");
                }
            }
        }
        System.out.print("\nEven numbers are: ");
        for(int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                element = array[row][col];
                if (element%2==0){
                    System.out.print(element+" ");
                }

            }
        }
    }
}
