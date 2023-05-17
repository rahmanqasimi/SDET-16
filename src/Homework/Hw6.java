package Homework;

public class Hw6 {
    boolean isPrime(int num) {
        boolean flag = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = false;
                }
            }
        return flag;
        }
    public static void main(String[] args) {
        Hw6 obj = new Hw6();
        int num;
        num = 16;
        boolean isPrime = obj.isPrime(num);
        System.out.println("The number is prime: "+isPrime);
    }
}
