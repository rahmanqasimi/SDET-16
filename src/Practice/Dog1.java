package Practice;

public class Dog1 {
    String name;
    String color;
    String breed;
    int age;

    Dog1(String dogName, String dogColor, String dogBreed, int dogAge){
        name = dogName;
        color = dogColor;
        breed = dogBreed;
        age = dogAge;
    }

    public Dog1(String bug, String black, String breed, int dogAge, double v) {
    }

    void printInfo(){
        System.out.println(name+ " "+ color+" "+breed+" "+ age);
    }
    // create 5 objects of this dog class provide initial values for each
    // object call the printinfo method
}
