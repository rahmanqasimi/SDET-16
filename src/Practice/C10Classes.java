package Practice;

import java.util.Scanner;

public class C10Classes {
    public static void main(String[] args) {

        String[] name = new String[5];
        String[] id = new String[5];
        int [] age = new int[5];
        char [] grade = new char[5];
        int [] weight = new int[5];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the names: ");
        for(int row = 0; row < name.length; row++){
                name[row] = scan.nextLine();            }

        System.out.println("Enter the ID: ");
        for(int row = 0; row < id.length; row++){
            id[row] = scan.nextLine();
        }

        System.out.println("Enter the age: ");
        for(int row = 0; row < age.length; row++){
            age[row] = scan.nextInt();
        }

        System.out.println("Enter the Grade: ");
        for(int row = 0; row < grade.length; row++) {
            grade[row] = scan.next().charAt(0);
        }
        System.out.println("Enter the weight: ");
        for(int row = 0; row < weight.length; row++){
            weight[row] = scan.nextInt();
        }


        for(String value: name){
            System.out.print(value+ " ");
        }
    }
}
