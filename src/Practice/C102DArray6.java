package Practice;

import java.util.Scanner;

public class C102DArray6 {
    public static void main(String[] args) {
        int num, rem, m;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        num = scan.nextInt();

        if (num<=0)
        {
            System.out.println("The number entered is not positive");
        }
        else if (num<=3)
        {
            System.out.println(num+" is Prime.");
        }
        else
        {
            do{
                m=2;
                rem = num % m;
                if(rem ==0){
                    System.out.println(num + " is not Prime");
                    break;
                }
                else {
                    m++;
                }
                if(m>=num){
                    System.out.println(num + " is a Prime");
                    break;
                }
            }while (m>=num);

        }

    }
}
