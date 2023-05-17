package Practice2;

public class P2 {
// Create a method that will find a number from an array
    public boolean searchArr(int[] array, int number){
        boolean isFound=false;
        for(int value: array){
            if(value == number){
                isFound = true;
            }
        }
        return isFound;
    };
public static void main(String[] args) {
    int[] arr = {1,3,4,5,6,7,8,9};
    P2 obj = new P2();
    int num = 4;
    obj.searchArr(arr,num);
}
}
