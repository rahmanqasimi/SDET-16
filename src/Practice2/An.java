package Practice2;

import Homework.Hours;

public class An {
    String name, breed;
    int age;
    double weight;
    static int noLegs=4;
    boolean hygiene;

    boolean alive;
    public void isServiced(){
        if(hygiene==true){
            System.out.println("It is serviced.");
        }
        else {
            System.out.println("It is not serviced.");
        }
    }
    public void isAlive(){
        if(alive==true){
            System.out.println("It is living.");
        }
        else {
            System.out.println("It is deceased.");
        }
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public An(String name, String breed, int age, double weight, boolean hygiene, boolean alive) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.hygiene = hygiene;
        this.alive = alive;
    }
}
class Dog extends An {

    public Dog(String name, String breed, int age, double weight, boolean hygiene, boolean alive) {
        super(name, breed, age, weight, hygiene, alive);
    }
}
class Horse extends An {

    public Horse(String name, String breed, int age, double weight, boolean hygiene, boolean alive) {
        super(name, breed, age, weight, hygiene, alive);
    }
}
class Cat extends An {

    public Cat(String name, String breed, int age, double weight, boolean hygiene, boolean alive) {
        super(name, breed, age, weight, hygiene, alive);
    }
}
class AnTester {

    public static void main(String[] args) {
        An obj = new An("Boo","German",4,9.9,true,true);
        Dog dog1 = new Dog("Dogg","Afghan",9,19.9,true,true);
        Cat cat1 = new Cat("Catt","American",4,6.9,false,true);
        Horse horse1 = new Horse("Horsee","Mustang",10,39.4,false,false);
        horse1.isAlive();
        
    }
}