package class12;


import java.sql.SQLOutput;

public class E10StringDemo {
    public static void main(String[] args) {

        String name="LEANDROR";
       // System.out.println(name.charAt(1));
        // counter how many times the letter R has appeared
        int counter=0;
        for (int i = 0; i < name.length(); i++) {

            if(name.charAt(i)=='R'){
               counter++;
            }
        }
        System.out.println(counter);


    }
}
