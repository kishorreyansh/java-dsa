package arraylist;
import java.util.ArrayList;
public class ArrayListOperations {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        // Adding Elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("List : "+list);

        //Adding in another way
        list.add(1,15);

        // Get Elements
        System.out.println("Get Element: " +list.get(2));

        //Remove Elements
        System.out.println(list.remove(3));
        System.out.println("New List : "+list);

        //Set Elements
        list.set(2, 10);
        System.out.println("New List using Set: "+list);

        //Contains Element
        System.out.println("Contains Element: "+list.contains(2));

        //size
        int size = list.size();
        System.out.println("Size: "+size);

        //Print the ArrayList
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    
}
