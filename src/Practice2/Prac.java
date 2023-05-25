package Practice2;

public class Prac {
    public static void main(String[] args) {
        String str = "Listen";
        char[] array = new char[str.length()];
        for (int i = 0; i < str.length(); i++){
            array[i] = str.charAt(i);
        }
        for (char v: array){
            System.out.println(v);
        }
    }
}
