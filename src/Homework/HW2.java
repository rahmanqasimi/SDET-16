package Homework;

public class HW2 {
    public static void main(String[] args) {
        String sent="This is sentence i want to reverse";
        String [] sArr = sent.split("[ ]");
        HW2 obj = new HW2();
        for (int i = 0; i< sArr.length; i++){
            sArr[i]=obj.reverse(sArr[i]);
            }
        for (int i = 0; i< sArr.length; i++){
            System.out.print(sArr[i]+" ");
        }
    }
     String reverse(String str){
        char ch;
        String rev="";
        for (int i = str.length()-1; i>=0; i--){
            ch = str.charAt(i);
            rev = rev + ch;
        }
        return rev;
    }
}
