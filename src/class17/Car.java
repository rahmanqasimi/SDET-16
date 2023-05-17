package class17;

public class Car {
    String make;
    String model;
    int engineCC;
    String color;
    Car(String make, String model, int engineCC, String color) {
        this.make=make;
        this.model=model;
        this.engineCC=engineCC;
        this.color=color;

    }

    void printInfo(){
        System.out.println(make+" "+model+" "+engineCC+" "+color);
    }
    public static void main(String[] args) {
        Car car=new Car("Honda","Civic type R",1800,"white");
        car.printInfo();
    }

}
