package GroupProject2;
public class Car {
    /*    Create a Class Car that would have the following fields: carPrice and
        color and method calculateSalePrice() which should be returning a
        price of the car.
        Create 2 sub classes: Sedan and Truck. The Truck class has a field
         as weight and has its own implementation of calculateSalePrice()
        method in which returned price is calculated as following: if
        weight>2000 then returned price car should include 10% discount,
        otherwise 20% discount.
        The Sedan class has field as length and also does it is own
                implementation of calculateSalePrice(): if length of sedan is >20 feet
        then returned car price should include 5% discount, otherwise 10%
        discount*/
    double carPrice;
    String carColor;
    public double calculateSalePrice() {
        return carPrice;
    }
    public Car(double carPrice, String carColor) {
        this.carPrice = carPrice;
        this.carColor = carColor;
    }
}
    class Truck extends Car {
        double weight;
        @Override
        public double calculateSalePrice() {
            if (weight > 2000) {
                super.carPrice = super.carPrice * 0.9;
            } else {
                carPrice = carPrice * 0.8;
            }
            return super.carPrice;
        }
        public Truck(double carPrice, String carColor, double weight) {
            super(carPrice, carColor);
            this.weight = weight;
        }
    }
    class Sedan extends Car {
        int lenght;
        @Override
        public double calculateSalePrice() {
            if (lenght > 20) {
                carPrice = carPrice * 0.95;
            } else {
                carPrice = carPrice * 0.9;
            }
            return carPrice;
        }
        public Sedan(double carPrice, String carColor, int lenght) {
            super(carPrice, carColor);
            this.lenght = lenght;
        }
    }
class CarTester {
    public static void main(String[] args) {
        Car corolla = new Sedan(25000, "Black", 21);
        Car camry = new Sedan(38000, "White", 10);
        Car tacoma = new Truck(44000, "Gray", 4000);
        Car ford = new Truck(45000, "Blue", 1000);

        System.out.println("Corolla Sale price is: " + corolla.calculateSalePrice());
        System.out.println("camry Sale price is: " + camry.calculateSalePrice());
        System.out.println("Tacoma Sale price is: " + tacoma.calculateSalePrice());
        System.out.println("Ford F-150 Sale price is: " + ford.calculateSalePrice());
    }
}



