package GroupProject2;

import java.util.Scanner;

public class Task5 {
/*    Find the First Non-Repeating Character in a String: Given a string,
    find and return the first non-repeating character. For example, in the
    string "abracadabra", the first non-repeating character is 'c'.*/
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first word: ");
    String word = scan.nextLine();
//      create a new string with trimmed and lowercased version of the actual string
    String wordT = word.trim().toLowerCase();
    char[] wordArr = StrToArr(wordT);
    char ch =' ';
//    compare each character with the whole array
    for(int i = 0; i< wordArr.length; i++){
        int count = 0;
        ch = wordArr[i];
//         if it is found more then increase the counter will always be at least 1 because it will compare to itself
        for(int j = 0; j<wordArr.length; j++){
            if(wordArr[i]==wordArr[j]){
                count++;
            }
        }
//        if it is found only once which is itself then break
        if(count==1){
            break;
        }
    }
    System.out.println(ch);
}
    // method to split a string into array of characters
    public static char[] StrToArr(String str) {
        char[] array = new char[str.length()];
        for (int i = 0; i < str.length(); i++){
            array[i] = str.charAt(i);
        }
        return array;
    }

}
