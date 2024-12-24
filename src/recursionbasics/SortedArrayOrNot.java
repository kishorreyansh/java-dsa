package recursionbasics;

public class SortedArrayOrNot {

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length - 1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        
        int arr[] = { 2,3,1,4,5};
        System.out.println("Is Array Sorted or Not: "+isSorted(arr, 0));
    }
    
}
