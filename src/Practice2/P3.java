package Practice2;

public class P3 {
    public double Avg(int[] array){
        double avg;
        int count=0, sum = 0;
        for(int arr: array){
            sum = arr+sum;
            count++;
        }
        avg = sum/count;
        return avg;
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        P3 obj = new P3();
        double avg = obj.Avg(array);
        System.out.println("average is: "+avg);
    }
}
