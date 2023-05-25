package GroupProject2;

import java.util.Scanner;

public class Task4 {
/*    Check if Two Strings are Anagrams: Given two strings, determine if
    they are anagrams, meaning they contain the same characters in a
    different order. For example, "listen" and "silent" are anagrams.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String fWord = scan.nextLine();
//      create a new string with trimmed and lowercased version of the actual string
        String fWordT = fWord.trim().toLowerCase();
        System.out.println("Enter the second word");
        String sWord = scan.nextLine();
        String sWordT = sWord.toLowerCase().trim();
//        if the length of strings is not the same, then they are definitly not anagrams
        if (fWordT.trim().length()==sWordT.trim().length()){
//          convert the string to array of characters
            char[] fWordArr = StrToArr(fWordT);
            char[] sWordArr = StrToArr(sWordT);
//          sort the array of characters
            fWordArr = SortArray(fWordArr);
            sWordArr = SortArray(sWordArr);
//          check if the sorted array of characters are equal or not
            boolean isAnagrams = compareArrays(fWordArr,sWordArr);
            if(isAnagrams){
                System.out.println("The words "+fWord+" and "+sWord+" are Anagrams");
            }else {
                System.out.println("The words "+fWord+" and "+sWord+" are not Anagrams");
            }
        }
        else {
            System.out.println("The words "+fWord+" and "+sWord+" are not Anagrams");
        }
}
// method to split a string into array of characters
    public static char[] StrToArr(String str) {
        char[] array = new char[str.length()];
        for (int i = 0; i < str.length(); i++){
            array[i] = str.charAt(i);
        }
        return array;
    }
//    method to sort the array of characters
    public static char[] SortArray(char[] array){
        char temp;
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
//  method to compare 2 string of characters, have to compare after sorting
    public static boolean compareArrays(char[] array1, char[] array2)
    {
        boolean isAnagrams = true;
        for(int i = 0; i< array1.length; i++)
            if(array1[i]!=array2[i]){
                isAnagrams = false;
                break;
            }
        return  isAnagrams;
    }
}