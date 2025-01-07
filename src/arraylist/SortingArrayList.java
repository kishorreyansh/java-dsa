package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("Initial List: "+list);
        Collections.sort(list);
        System.out.println("Sorted List: "+list);
        //Descending Order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorted Reverse List: "+list);
    }
    
}
