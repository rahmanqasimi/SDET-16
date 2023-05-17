package class12;

public class Task2 {
    public static void main(String[] args) {
        String name="Today is Saturday";  //3 10 15
        //print all the indexes wherever the letter 'a' is appearing

        for (int i = 0; i <name.length() ; i++) {
            if(name.charAt(i)=='a'){
               // System.out.print(i+" ");
                System.out.println(name.charAt(i));
            }
        }
    }
}
