package Practice2;

public class Vehicle {
    String make;
    String model;
    int year;

    boolean po;

    public void pON(){
        System.out.println(make+" "+model+ " "+year+" is powered on with key");
    po = true;
    }
    public void pOff(){
        System.out.println(make+" "+model+ " "+year+" is powered off with key");
        po = false;
    }
    public void status(){
        if(po==false){
            System.out.println(make+" "+model+ " "+year+" is powered OFF");
        }
        else if (po){
            System.out.println(make+" "+model+ " "+year+" is powered ON");
        }
    }

    public Vehicle(String make, String model, int year, boolean po) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.po = po;
    }
}
class Sedan extends Vehicle{

    public Sedan(String make, String model, int year, boolean po) {
        super(make, model, year, po);
    }
    public void exSedan(){
        System.out.println("This is exSedan");
    }
}
class Suv extends Vehicle{

    public Suv(String make, String model, int year, boolean po) {
        super(make, model, year, po);
    }
    @Override
    public void pON() {
        System.out.println(make+" "+model+ " "+year+" is powered on with remote");
        po = true;
    }
    @Override
    public void pOff() {
        System.out.println(make+" "+model+ " "+year+" is powered off with remote");
        po = false;
    }
    public void exSuv(){
        System.out.println("This is exSuv");
    }
}
class Truck extends Vehicle{

    public Truck(String make, String model, int year, boolean po) {
        super(make, model, year, po);
    }
    @Override
    public void pON() {
        System.out.println(make+" "+model+ " "+year+" is powered on using keyless");
        po = true;
    }
    @Override
    public void pOff() {
        System.out.println(make+" "+model+ " "+year+" is powered off using keyless");
        po = false;
    }
    public void exTruck(){
        System.out.println("This is exTruck");
    }
}
class VehicleTester{
    public static void main(String[] args) {
        Vehicle[] veh ={new Sedan("Toyota","Corolla",2015,false),new Suv("Ford","Explorer",2019, false),
                new Truck("Ram", "F1500",2020,false)};

        Vehicle vehSedan =new Sedan("Toyota","Corolla",2015,false);

        Vehicle vehSuv =new Suv("Ford","Explorer",2019, false);

        Vehicle vehTruck =new Truck("Ram", "F1500",2020,false);


//        ((Sedan)vehSedan).exSedan();

        for(Vehicle v: veh) {
            if (v instanceof Sedan) {
                ((Sedan)v).exSedan();
            }
            else {
                System.out.println("Not possible");
            }
//            v.status();
        }


    }
}