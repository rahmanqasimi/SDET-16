package class12;

public class Task1 {
    public static void main(String[] args) {

        String username = "";
        String password = "";
        String confirmyourpassword = "pass1234567";

        // Break till 1:54
        if (username.isBlank() && password.isBlank()) {
            System.out.println("Username or Password cannot be empty");
        } else if (password.length() < 8) {
            System.out.println("Password is too short");
        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(confirmyourpassword)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }


    }
}
