package class18;

import java.lang.invoke.VarHandle;

public class Honda extends Vehicle {

}

class BMW extends Vehicle{

    void offerMPackage(){
        System.out.println("Only BMW offers the M package");
    }
}
class Audi extends Vehicle{


}

class CarTester{
    public static void main(String[] args) {

        Honda honda=new Honda();
        honda.stopCar();
    }
}
