package collectionsexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListxample {

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);

        System.out.println(al);

        for(Integer i:al){
            System.out.println(i);
        }
//        Iterator<Integer> iter = al.iterator();
//        while(iter.hasNext()){
//            System.out.println("Iteration Level "+iter.next());
//        }

        al.addAll(List.of(10,20,1));
        System.out.println(al);
        System.out.println("___________");
        al.removeAll(List.of(1,5,6));
        System.out.println(al);
        System.out.println("________");
        al.retainAll(List.of(1,2,3));
        System.out.println(al);

    }
    
}
