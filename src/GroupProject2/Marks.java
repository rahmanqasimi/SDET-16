package GroupProject2;

public abstract class Marks {
    /*    We have to calculate the average of marks obtained in three subjects
    by student A and by student B. Create class 'Marks' with an abstract
    method 'getPercentage' that will be returning the average percentage
    of marks. Provide implementation of abstract method in classes 'A'
    and 'B'. The constructor of student A takes the marks in three
    subjects as its parameters and the marks in four subjects as its
    parameters for student B. Test your code*/
    abstract public double getPercentage();
}
class A extends Marks{
    int sub1;
    int sub2;
    int sub3;
    @Override
    public double getPercentage() {
        double avg = (sub1+sub2+sub3)/3;
        return avg;
    }
    public A(int sub1,int sub2, int sub3){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
}
class B extends Marks{
    int sub1, sub2, sub3, sub4;
    @Override
    public double getPercentage() {
        double avg = (sub1+sub2+sub3+sub4)/4;
        return avg;
    }
    public B(int sub1,int sub2, int sub3, int sub4){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }
}
class MarkTester{
    public static void main(String[] args) {
        Marks student1 = new A(95,93,97);
        System.out.print("The avg marks for student A is: "+student1.getPercentage());

        Marks student2 = new B(90,93,99,94);
        System.out.print("\nThe avg marks for student B is: "+student2.getPercentage());
    }
}