package Tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        Write a Java Program to print the first 10 numbers of Fibonacci series.
         */
        //We will store the Fibonacci series in the array
        int [] series = new int[10];
        // assigning the first and second numbers
        series[0]= 0;
        series[1] = 1;
        // calculate the rest of the series
        for(int i =2; i< series.length; i++){
            series[i]= series[i-1]+ series[i-2];
        }
        // print the first 10 numbers of the Fibonacci series
        System.out.print("The first 10 numbers in the Fibonacci series are: ");
        for(int value: series){
            System.out.print(value+", ");
        }
    }
}
