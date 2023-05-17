package Practice;

public class C102DArray2 {
    public static void main(String[] args) {
        String[][] names = {
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}
        };
        String element;
        for(int row = 0; row < names.length; row++){
            System.out.println("");
            for(int col=0; col <names[row].length; col++){
                element = names[row][col];
                System.out.print(element+" ");
            }
        }
    }
}
