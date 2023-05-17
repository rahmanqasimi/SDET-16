package Practice;

import java.util.Scanner;

public class P11 {
    int [] createArray (int size){
        int [] array = new int[size];
        for(int i =0; i< array.length; i++){
            array[i]=10;
        }
    return array;
    }
    public static void main(String[] args) {
        P11 obj = new P11();
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size = scan.nextInt();
        int [] array = new int[size];
        array = obj.createArray(size);
        System.out.print("The array is :");
        for(int i = 0; i<size; i++){
            System.out.print(array[i]+" ");
        }
    }
}
