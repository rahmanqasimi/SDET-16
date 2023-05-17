package Tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integers. Develop a program
        which will calculate the sum of even and odd numbers
        for that array.
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
        int oddSum=0;
        int evenSum=0;
        // traverse the 2D array and sum even and odd numbers
        for(int i=0; i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]%2==0){
                    evenSum=evenSum+array[i][j];
                }
                else{
                    oddSum=oddSum+array[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers equals to: "+evenSum);
        System.out.println("The sum of odd numbers equals to: "+oddSum);

    }
}