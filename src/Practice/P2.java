package Practice;

public class P2 {
    public static void main(String[] args) {
        String name="Today is Saturday";

        System.out.print("The indexes are: ");
        for(int i=0; i< name.length();i++){
            if(name.charAt(i)=='a'){
                System.out.print(i+", ");
            }
        }
    }
}
