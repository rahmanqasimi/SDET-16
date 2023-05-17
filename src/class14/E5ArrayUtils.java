package class14;

import java.util.function.BinaryOperator;

public class E5ArrayUtils {
    /*
    crate a method, call it contains. It should take an array of int and an
    int number in the method body. It should search the array for that number,
    if number is present in the array method should return true, otherwise method
    should return false. In a separate class call the method and test it for below
    input {10,20,45} number 20
    15
     */
    /*
    return type => boolean
    name of method =>contains
    parameters => int [] arr, int num
    body {


    }
     */

    boolean contains(int[] arr, int num){
        boolean isFound=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                isFound=true;
                break;
            }
        }
        return isFound;
    }
}
