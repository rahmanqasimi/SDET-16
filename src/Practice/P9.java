package Practice;

public class P9 {
    public static void main(String[] args) {
        int num = 32;
        P9 obj = new P9();
        boolean even = obj.isEven(num);
        System.out.println(even);
    }
    boolean isEven (int num){
        boolean check=false;
        if(num%2==0){
            check = true;
        }
    return check;
    }
}
