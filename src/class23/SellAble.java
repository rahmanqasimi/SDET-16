package class23;

public interface SellAble {

    //   private int PRICE=12000; private access modifier not allowed
    //   protected int PRICE=12000; protected access modifier not allowed
     int PRICE = 12000;

//  final  abstract void sell(); // final not allowed as methods are abstract by default
 // static void sell(); // not allowed as static methods can't be overridden
 //   private void sell(); // not allowed as not one will be able to provide implementations
    //protected void sell(); not allowed


}
class Tester1{
    public static void main(String[] args) {

    }
}

