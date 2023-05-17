package class17;

public class Cat {
    String name;

    Cat(String catName){
        name=catName;
        System.out.println("1 argument constructor called");
    }
    Cat(String name,String color){
        System.out.println("2 argument constructor called");
    }

/* Not allowed as we already have a constructor that takes a String value
 Cat(String color){
        System.out.println("1 argument constructor called");
    }*/
    Cat(int age){
        System.out.println("Int argument constructor");
    }
    Cat(double weight){
        System.out.println("double   argument constructor");
    }
    Cat(){
        System.out.println("0 argument constructor called");
    }


    void printInfo(){
        System.out.println(name);
    }
    public static void main(String[] args) {

        //String color;
      //  System.out.println(color);
        Cat cat=new Cat("lobi","brown");
       // cat.printInfo();
    }
}
