package Homework;

import java.util.Scanner;

public class Hw5 {
    String createEmail(String fName, String lName, String emailType){
        String ret = fName+lName+"@"+emailType+".com";
        return ret;
    }

    public static void main(String[] args) {
        Hw5 obj = new Hw5();
        String fName,lName,emailType, email;
        System.out.println("Enter the first name: ");
        Scanner scan = new Scanner(System.in);
        fName = scan.nextLine();
        System.out.println("Enter the last name: ");
        lName = scan.nextLine();
        System.out.println("Enter the email type: ");
        emailType = scan.nextLine();
        email = obj.createEmail(fName,lName,emailType);
        System.out.println("The email address is: "+email);
    }
}
