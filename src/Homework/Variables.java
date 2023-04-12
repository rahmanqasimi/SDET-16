package Homework;

public class Variables {
    public static void main(String[] args) {
        /* 2)Create a Java program and name it Variables
        In your program create different type of variables to store student’s information
        (name, last name, grade, city, state, phone number)
        and then print value of those variables in the format:
        My name is  and my  last name is __
        I am A/B student
        I live in city and state__
        And my phone number is …..

        3)Change student’s city, state, phone number and grade. And print those updated values:
        Example:
        My name is  and I moved to new city and new state. My new phone number is */
        String firstName="John";
        String lastName="Doe";
        String grade = "A+";
        String city="Herndon";
        String state="Virginia";
        String cell="703-988-8888";

        System.out.println("My Name is "+firstName+" "+lastName+".");
        System.out.println("I am "+grade+" student.");
        System.out.println("I live in "+city+", "+ state+".");
        System.out.println("And my cell number is "+cell+".");

        city = "San Diego";
        state = "California";
        cell = "619-319-3499";

        System.out.println("\nMy Name is "+firstName+" "+lastName+" And I moved to "
                +city+", "+state+". My new cell number is "+cell+".");


    }
}
