package Practice;

public class C102DArray3 {
    public static void main(String[] args) {
        String[][] names = {
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}
        };
        for(String[] row:names){
            System.out.println("");
            for (String element:row){
                System.out.print(element+" ");

            }
        }
    }
}
