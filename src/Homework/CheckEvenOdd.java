package Homework;

public class CheckEvenOdd {
    public static void main(String[] args) {

        int number= 33;

        int check=number%2;

        if (check==0)
        {
            System.out.println("The number "+number+" is even.");
        }
        else
        {
            System.out.println("The number "+number+" is odd.");
        }
    }
}
