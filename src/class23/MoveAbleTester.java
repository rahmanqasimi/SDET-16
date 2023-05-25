package class23;

public class MoveAbleTester {
    public static void main(String[] args) {
        MoveAble moveAble=new Horse();
        WashAble washAble=new Dog();
        MoveAble[] moveAbles={new Cat(),new Dog()};

        for (MoveAble m:moveAbles
             ) {
            m.move();
        }
    }
}
