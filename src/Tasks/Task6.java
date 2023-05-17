package Tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        Write a java program to check whether a given
        number is prime or not?
         */
        Scanner scan = new Scanner(System.in);
        // get the number from the user
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        if(num<=0){
            System.out.println("Invalid number.");
        }
        else {
            int flag =0;
            if(num == 1 || num ==2){
                flag =1;
                System.out.println(num+" is not a Prime number.");
            }
            else {
                for (int i =2; i<=num/2; i++){
                    if (num % i == 0)
                    {
                        flag = 1;
                        break;
                    }
                }
                if(flag ==0){
                    System.out.println(num+ " is a Prime number.");
                }
                else {
                    System.out.println(num+ " is not a Prime number.");
                }
            }
        }



    }
}
