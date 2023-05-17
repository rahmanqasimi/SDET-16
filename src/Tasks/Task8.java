package Tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /*
        Maximum and minimum number in the array?
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
        int min=array[0];
        int max=array[0];
        // compare each element with max and min, and swap numbers when necessary
        for(int value: array){
            if(min>value)
            {
                min=value;
            }
            if(max<value){
                max=value;
            }
        }
        //print out the max and min
        System.out.println("The largest element of the array was: "+max);
        System.out.println("The lowest element of the array  was: "+min);

    }
}
