package class21;

public class E1Poly {
    public static void main(String[] args) {

        Animal[] animals = {new Dog("Kantoor", "black", "German"),
                new Cat("Pesho", "Grey", "Italian"),
                new Horse("Kal", "Black", "Turkish")
        };


        for (Animal animal : animals) {

            animal.speak();
            animal.eat();
            animal.sleep();
        }

        Animal dogStoredInAnimal = new Dog("Kantoor", "black", "German");
        //we must type cast the dogStoredInAnimal back to a dog to call the run method
        //as this run method only exits in the Dog class.
        Dog d = (Dog) dogStoredInAnimal;
        d.run();
        // direct way without using a variable
        ((Dog)dogStoredInAnimal).run();

        int num = (int) 10.5;

    }
}
