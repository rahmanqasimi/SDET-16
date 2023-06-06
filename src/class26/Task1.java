package class26;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer,String> company=new LinkedHashMap<>();
        company.put(1,"Google");
        company.put(2,"Syntax");
        company.put(3,"Microsoft");
        company.put(4,"Amazon");
        company.put(5,"Target");
        company.put(5,"Target");
        company.put(7,"Best buy");

        System.out.println(company.size());
        company.replace(4,"Trader Joes");
        company.remove(7);
        System.out.println(company);
    }
}
