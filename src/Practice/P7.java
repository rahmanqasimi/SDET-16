package Practice;

public class P7 {
    public static void main(String[] args) {
        int [] arr= {10,20,45};
        int num = 20;
        P7 obj = new P7();
        boolean result = obj.contains(arr, num);
        System.out.println("Search result = "+ result);
    }
    boolean contains(int [] array, int num) {
        boolean res = false;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                res = true;
            }
        }
        return res;
    }
}
