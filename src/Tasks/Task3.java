package Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store
        odd and even numbers. Develop a program which will
        identify/print the even numbers only.
        */
        Scanner scan = new Scanner(System.in);
        // get the size as in row and columns of the array from the user
        System.out.println("Please enter the number of rows for the array: ");
        int row = scan.nextInt();
        System.out.println("Please enter the number of columns for the array: ");
        int col = scan.nextInt();

        int [][] array = new int[row][col];
        //get the elements of the array from the user
        System.out.println("Please enter the elements of the array: ");
        for(int i=0; i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        // traverse the 2D array and print out even numbers
        for(int i=0; i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]%2==0){
                    System.out.print(array[i][j]+" ");
                }
            }
        }
    }
}
