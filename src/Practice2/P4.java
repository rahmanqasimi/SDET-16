package Practice2;

public class P4 {
    public int search(double[] arr, double num){
        int count = 0;
        for (double value: arr) {
            if(value == num){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        double[] array={1,2,3,4,5,4,7,4,9,6};
        P4 obj = new P4();
        double num = 4;
        int count = obj.search(array,num);
        System.out.println(num+" is repeated "+count+" times in the array.");
    }
}
