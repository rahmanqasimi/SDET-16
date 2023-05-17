package Practice;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String user;
        String pass;
        String confPass;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username");
        user = scan.nextLine();

        System.out.println("Enter password");
        pass = scan.nextLine();

        System.out.println("Confirm password");
        confPass = scan.nextLine();

        if (user.isBlank() || pass.isBlank()){

            System.out.println("username or password cannot be empty");
        } else if(pass.length()<8){
            System.out.println("password is too short");
        }
            else if(!pass.equals(confPass)){
                        System.out.println("Password does not match");
                    }
                    else if (pass.contains(user)){
                            System.out.println("Password connot contain username");;
                        }
                        else {
                            System.out.println("Username and password has been created");
                        }


    }
}
