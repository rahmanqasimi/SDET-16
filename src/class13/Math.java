package class13;

public class Math {

    void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    //defining a method
    void multiply(int num1,int num2){
        System.out.println(num1*num2);
    }

    public static void main(String[] args) {
        // creatting the object of Math class calling it math
        Math math=new Math();
        // calling the method add and passing two values
        math.add(10,10);
        math.multiply(5,5);
    }
}
