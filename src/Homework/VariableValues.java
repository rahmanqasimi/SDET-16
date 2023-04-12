package Homework;

public class VariableValues {
    public static void main(String[] args) {
        /* 1)Create a Java program and name it Variable Values
        In your program declare variables using different ways to store all different primitive data.
        Update value of all variables
        Print the value of each updated variable
        */

        boolean employment=true;
        byte age=30;
        short  expenses=4500;
        int income= 6700;
        long budget= 2340000L;
        char currency='$';
        float monthlyExpense=3430.33F;
        double annualExpense=448883.33;

        System.out.println("Values of the variables:");
        System.out.println("Is he employed = "+employment);
        System.out.println("His age = "+age);
        System.out.println("His expenses = "+currency+expenses);
        System.out.println("His income = "+currency+income);
        System.out.println("His budget = "+currency+budget);
        System.out.println("The currency = "+currency);
        System.out.println("His monthly Expense = "+currency+monthlyExpense);
        System.out.println("His annual expense = "+currency+annualExpense);

        employment= false;
        age= 31;
        expenses = 5000;
        income = 0;
        budget = 130000L;
        currency= '\u20ac';
        monthlyExpense= 4390.23F;
        annualExpense= 349920.23;
        System.out.println("");
        System.out.println("");
        System.out.println("The updated values are:");
        System.out.println("Values of the variables:");
        System.out.println("Is he employed = "+employment);
        System.out.println("His age = "+age);
        System.out.println("His expenses = "+currency+expenses);
        System.out.println("His income = "+currency+income);
        System.out.println("His budget = "+currency+budget);
        System.out.println("The currency = "+currency);
        System.out.println("His monthly Expense = "+currency+monthlyExpense);
        System.out.println("His annual expense = "+currency+annualExpense);

    }
}
