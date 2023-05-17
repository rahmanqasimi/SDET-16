package class21;

public  class Parent {
   final int noOfMonthsInYear=12;

    final void getMarry() {
       // noOfMonthsInYear=13;
        System.out.println("Marry Shakira");
    }
    void study(){
        System.out.println("Study medicine ");
    }
}

class Axel extends Parent {
    final int noOfOursInaDay=24;
    @Override
    void study() {
        System.out.println(noOfMonthsInYear);
        System.out.println("No i want SDET");
    }
}


