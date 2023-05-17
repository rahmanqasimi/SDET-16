package Practice;

import java.util.Scanner;

public class P13 {
    int sumArr(int [] array){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        P13 obj = new P13();
        System.out.println("Enter the size of the array: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println("Enter the elements");
        int [] array = new int[size];
        for(int i =0; i< array.length; i++){
            array[i]= scan.nextInt();
        }
        int sum = obj.sumArr(array);
        System.out.println("The sum = "+ sum);
    }
}
