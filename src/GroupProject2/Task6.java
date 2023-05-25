package GroupProject2;

/*    Create an Interface 'Shape' with undefined methods as calculateArea
    and calculatePerimiter. Create 2 classes Circle & Square that
    implements functionality defined in the Shape Interface. Test your
    code.*/
interface Shape {
    public double calculateArea(double value);
    public double calculatePerimeter(double value);
}
class Circle implements Shape{
    @Override
    public double calculateArea(double r) {
        double area = 3.14* r *r;
        return area;
    }
    @Override
    public double calculatePerimeter(double r) {
        double perimeter =2*3.14*r;
        return perimeter;
    }
}
class Square implements Shape{
    @Override
    public  double calculateArea(double s){
        double area = s *s ;
        return area;
    }
    @Override
    public double calculatePerimeter(double s){
        double perimeter = 4 * s;
        return perimeter;
    }
}
class Tester{
    public static void main(String[] args) {
        Circle cir = new Circle();
        Square sq = new Square();
        double r = 5;
        double s = 9;
        cir.calculateArea(r);
        System.out.println("The area of a Circle with Radius="+r+" is: "+cir.calculateArea(r));
        System.out.println("The Perimeter of a Circle with Radius="+r+" is: "+cir.calculatePerimeter(r));

        System.out.println("The area of a Square with side="+s+" is: "+sq.calculateArea(s));
        System.out.println("The Perimeter of a Square with side="+s+" is: "+sq.calculatePerimeter(s));
    }
}
