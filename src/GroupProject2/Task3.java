package GroupProject2;

import java.util.Scanner;

public class Task3 {
/*    Count the Number of Words in a String: Write a function to count the
    number of words in a given string. Words are separated by spaces or
    punctuation. For example, the input "Hello, world!" should return 2.  */
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the sentence: ");
    String sent = scan.nextLine();

    int count = spl(sent);
    System.out.println(count);
}
//    method to split the string by space or punctuations , . ; ? : ! -
public static int spl(String str){
    String [] arr = str.split("[ ,.;?:!-]");
    int count=0;
//  count the non empty strings
    for(int i =0; i< arr.length; i++){
        if(!arr[i].equals("")){
            count++;
        }
    }
    return count;
    }
}
