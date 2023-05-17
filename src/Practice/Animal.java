package Practice;

public class Animal {
    String name, color, breed;
    int age;
    double weight;

    void printInfo() {
        System.out.println(name + " " + color + " color animal, is " + age + " years old, and weighs " + weight + " pounds.");
    }

    public Animal(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public class Dog extends Animal {

        public Dog(String name, String color, String breed, int age, double weight) {
            super(name, color, breed, age, weight);
        }
    }

    public class Horse extends Animal {

        public Horse(String name, String color, String breed, int age, double weight) {
            super(name, color, breed, age, weight);
        }
    }

    public class cat extends Animal {

        public cat(String name, String color, String breed, int age, double weight) {
            super(name, color, breed, age, weight);
        }
    }
}
    class AnimalTester {


    public static void main(String[] args) {

        Animal dog1 = new Animal("Bug","Black","Breed",9, 18.2);

    }
}

