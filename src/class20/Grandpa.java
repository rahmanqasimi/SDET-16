package class20;

import java.sql.SQLOutput;

public class Grandpa {
    double money=150;
}
class Father extends Grandpa{
    double money=100;
}
class Child extends Father{
    void printMoney(){
        System.out.println(super.money);
    }
}
class Tester{
    public static void main(String[] args) {
        Child ch=new Child();
        ch.printMoney();
    }
}
