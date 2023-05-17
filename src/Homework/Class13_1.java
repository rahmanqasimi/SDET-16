package Homework;

public class Class13_1 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        Class13_1 obj = new Class13_1();
        System.out.println("sum = "+ obj.sumArr(arr));
    }
    int sumArr (int [] arr){
        int sum = 0;
        for (int value: arr){
            sum = sum + value;
        }
        return sum;
    }
}
