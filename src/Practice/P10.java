package Practice;

public class P10 {
    public static void main(String[] args) {
        P10 obj = new P10();
        obj.lang("Afghanistan");

    }

    void lang (String country){
        if(country.equals("Afghanistan")){
            System.out.println("stere mishai");
        }
        if(country.equals("India")){
            System.out.println("Hey");
        }
    }
}
