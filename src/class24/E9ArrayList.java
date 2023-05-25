package class24;

import java.util.ArrayList;

public class E9ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Coke");
        names.add("coffee");
        names.add("Water");
        names.add("juice");
      /*  for (String word:names){
            if(word.endsWith("e")){
                names.remove(word);
            }
        }
*/
        for (int i = 0; i < names.size(); i++) {
            String word=names.get(i);
            if(word.endsWith("e")){
                names.remove(i);
                i--;
            }
        }
        System.out.println(names);
    }
}
