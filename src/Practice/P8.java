package Practice;

public class P8 {
    public static void main(String[] args) {
        int [] arr= {10, 20, 45};
        int num = 10;

        boolean res = true;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                res = true;
            }
            else{
                res = false;
            }
        }
//        P7 obj = new P7();
//        boolean result = obj.search(arr, num);
        System.out.println("Search result = "+ res);
    }
}
