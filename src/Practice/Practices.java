package Practice;

public class Practices {
    public static void main(String[] args) {

        String[] array = {"Ahmad", "Mahmud", "Najeeb", "Ahmad", "Faheem", "Mahmud", "Kareem"};

        System.out.println("Duplicate elements in the given array are: ");
        //Searches for duplicate element
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if(array[i].equals(array[j]))
                    System.out.println(array[j]);
            }
        }
    }
}
