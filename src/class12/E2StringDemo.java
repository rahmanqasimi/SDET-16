package class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String userName="admin";
        String password="pass123";
        // write code to check the username and password if the userName or
        // password are less than 8 characters this msg "Signup successful"
        //Otherwise print "UserName and password can't be more than 8 character"

        if(userName.length()>8 || password.length()>8){
            System.out.println("UserName and password can't be more than 8 character");
        }else{
            System.out.println("Signup successful");
        }


    }
}
