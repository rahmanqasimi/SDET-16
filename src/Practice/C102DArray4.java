package Practice;

import java.util.Scanner;

public class C102DArray4 {
    public static void main(String[] args) {
        String [][] names= new String[3][4];
        Scanner scan = new Scanner(System.in);
/*
        System.out.println("Enter the names: ");
        for (String[] row: names){
            for (String element:row){
                element = scan.nextLine();
            }
        }

      String[][] names = {
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}
        };
*/
        String element;
        System.out.println("Enter the names: ");
        for(int row = 0; row < names.length; row++){
            for(int col=0; col <names[row].length; col++){
                names[row][col] = scan.nextLine();

            }
        }
        System.out.print("Array is : ");
        for (String[] row: names){
            System.out.println("");
            for (String ele:row){
                System.out.print(ele + " ");
            }
        }
    }
}
