package class26;

import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("USA","DC");
        countries.put("Canada","Montrial");
        countries.put("Egypt","Cairo");
        countries.put("France","Paris");
        countries.put("England","London");
      //  Set<String> countrySet=countries.keySet();
        for (String s : countries.keySet()) {
            System.out.println(s);
        }
        System.out.println("******************");
        for(String v:countries.values()){
            System.out.println(v);
        }
        System.out.println("******************");
        // Var keywors is used here instead of typing Map.Entry<String,String>
        for(var e:countries.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }


    }
}
