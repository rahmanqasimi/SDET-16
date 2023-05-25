package GroupProject2;

import java.util.Scanner;

public class Registration {
    /*    Create Registration Class in which you would have variables as
    email, userName and password that have an access scope only
    within its own class. After creating an object of the class user should
            be able to call methods and in each method separately pass values
            to set users email, username and password.
    Requirements:
    A. Valid email consider to be only yahoo
    B. Valid userName and password cannot be empty and should be of
    length larger*/
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email1){

            email = email1;

    }
    public void setUserName(String userName1){

        userName = userName1;
    }

    public void setPassword(String password1){
        if(password1.contains(userName)){
            System.out.println("Password cannot contain username");
        }
        else {
            password = password1;
        }

    }
}
class Reg{
    public static void main(String[] args) {
        Registration student1 = new Registration();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your email: ");
        String email = scan.nextLine();
        if(!email.contains("yahoo")){
            System.out.println("Only Yahoo emails are acceptable");
            System.exit(0);
        }
        else {
            student1.setEmail(email);
        }
        System.out.println("Please enter your username: ");
        String username = scan.nextLine();
        if(username.isBlank()){
            System.out.println("Username cannot be empty");
            System.exit(0);
        }else if (username.length()<7) {
            System.out.println("Username should have more than 6 characters");
            System.exit(0);
        }
        else {
            student1.setUserName(username);
        }
        System.out.println("Enter password");
        String password = scan.nextLine();
        if(password.isBlank()){
            System.out.println("Password cannot be blank");
        } else if (password.length()<7) {
            System.out.println("Password should have more than 6 characters");
        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        }
        else {
            student1.setPassword(password);
        }

    }
}