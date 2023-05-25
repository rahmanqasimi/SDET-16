package GroupProject2;

import java.util.Scanner;

public class Task2 {

/*    Check if a String is Palindrome: Determine whether a given string is
    a palindrome, which means it reads the same forwards and
    backward. For example, "madam" is a palindrome.*/

//    method to reverse the given string
    public static String Rev (String st){
        String reversed = "";
        char ch;
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
        String rev = Rev(str);
//        check to see if the reverse of the string is same as the actual string
        if(str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println(str+" is Palindrome");
        }
        else
        {
            System.out.println(str+" is not Palindrome");
        }
    }
}
