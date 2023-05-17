package class22;

public interface ArrayUtil {
    //search the array for the number if found return true
    public boolean searchArr(int [] array,int number);

    double getAvg(double[] arr);

    int getCount(double [] arr,double number);

    int add(int num1,int num2);
}
// Break till 2PM
class Main implements ArrayUtil{



    @Override
    public boolean searchArr(int[] arr, int num) {
        for (int j : arr) {
            if (j == num) {
                return true;
            }
        }
        return false;

    }

    @Override
    public double getAvg(double []arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+i;

        }
        return sum;
    }

    @Override
    public int getCount(double[] arr, double number) {
        int sum = 0;
        for (double v : arr) {
            if (v == number) {
                sum++;

            }
        }
        return sum;
    }

    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }
}
