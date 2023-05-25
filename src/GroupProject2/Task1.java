package GroupProject2;

import java.util.Scanner;

public class Task1 {

/*    Reverse a String: Write a function to reverse a given string. For
    example, given the input "Hello", the output should be "olleH".*/

//    method to reverse the given string
public static String Rev (String st){
    String reversed = "";
    char ch;
//    loop to add the last character of the string to the new string
    for (int i = st.length()-1; i>=0; i--){
        ch = st.charAt(i);
        reversed = reversed + ch;
    }
    return reversed;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scan.nextLine();
        System.out.println("The reverse of the given string is: \n"+Rev(str));
    }

}
