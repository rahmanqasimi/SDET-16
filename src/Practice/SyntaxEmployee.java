package Practice;

public class SyntaxEmployee {

    String empId;
    double salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee obj1= new SyntaxEmployee();
        SyntaxEmployee obj2= new SyntaxEmployee();
        SyntaxEmployee obj3= new SyntaxEmployee();
        obj1.empId = "EMP01";
        obj1.salary = 78000;
        obj2.empId = "EMP02";
        obj2.salary = 89000;
        obj3.empId = "EMP03";
        obj3.salary = 99000;
        System.out.println("Employee 1 Info: ID="+obj1.empId +", Salary="+obj1.salary+", CEO="+SyntaxEmployee.CEO);
        System.out.println("Employee 2 Info: ID="+obj2.empId +", Salary="+obj2.salary+", CEO="+SyntaxEmployee.CEO);
        System.out.println("Employee 3 Info: ID="+obj3.empId +", Salary="+obj3.salary+", CEO="+SyntaxEmployee.CEO);
    }
}
