package arraylist;

import java.util.ArrayList;

public class Swap2Numbers {

    public static void swap(ArrayList<Integer> list, int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("List Before Swapping: "+list);
        int indx1 = 1, indx2 = 3;
        swap(list,indx1,indx2);
        System.out.println("List After Swapping: "+list);
    }
    
}
