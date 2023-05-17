package Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
/*      Create a program that uses an array to store a list of
        temperatures for a week, and then uses a loop to find
        the highest and lowest temperature for the week.
*/
        Scanner scan = new Scanner(System.in);
//      we get the temperatures from the user
        System.out.println("Please Enter the temperature for each day of the week: ");
        int [] temp = new int[7];
        for(int i=0; i < temp.length; i++){
            temp[i]= scan.nextInt();
        }
        // set min and max to the first index
        int min=temp[0];
        int max=temp[0];
        // compare each element with max and min, and swap numbers when necessary
        for(int day: temp){
            if(min>day)
            {
                min=day;
            }
            if(max<day){
                max=day;
            }
        }
        //print out the max and min
        System.out.println("The highest temperature of the week was: "+max);
        System.out.println("The lowest temperature of the week was: "+min);
    }
}
