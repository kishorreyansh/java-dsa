package recursionbasics;

public class FirstOccurenceElementInArray {

    public static int findFirstOccurence(int arr[], int i,int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return findFirstOccurence(arr, i+1, key);
    }

    public static void main(String[] args) {
        
        int arr[] = { 2 , 3, 1, 7, 1};
        int key = 7;
        System.out.println("First Occurence of Element" + " " +key+ ": "+findFirstOccurence(arr, 0, key));
    }
    
}
