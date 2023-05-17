package Practice;

public class P {
    public static void main(String[] args) {
        String name ="LEANDROR";
        char ch = '0';
        int counter = 0;
        for (int i =0; i< name.length();i++)
        {
            ch = name.charAt(i);
            if(ch =='R'){
                counter++;
            }
        }
        System.out.println(ch + " = "+counter);
    }
}
