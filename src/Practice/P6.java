package Practice;

public class P6 {
    public static void main(String[] args) {
        P6 obj = new P6();
        int a = 10;
        int b = 20;
        int sum = obj.add(a, b);
        System.out.println("sum = "+ sum);
    }
    int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}
