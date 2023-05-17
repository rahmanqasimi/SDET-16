package Practice;

public class C102DArray5 {
    public static void main(String[] args) {
        boolean [][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false}

        };
        int counter=0;
        for (boolean[] arr1D:arr2D) {
            for (boolean value: arr1D){
                if (value==true){
                    counter++;
                }
            }

        }
        System.out.println("No of True = "+ counter);
    }
}
