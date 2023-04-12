package Practice;

import java.util.Scanner;

public class height {
    public static void main(String[] args) {
        int h;

        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter your height in inches: ");
        h=scan.nextInt();

        if(h<60){
            System.out.println("short");
        } else if (h>60 && h<72) {
            System.out.println("Medium");
        } else if (h>72) {
            System.out.println("Tall");
        }

    }
    }
