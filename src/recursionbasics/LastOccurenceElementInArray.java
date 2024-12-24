package recursionbasics;

public class LastOccurenceElementInArray {

    public static int findLastOccurence(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        int isFound = findLastOccurence(arr, i+1, key);
        if(isFound == -1 && arr[i] == key ){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        
        int arr[] = { 2,3,1,7,3,1,7,5};
        int key = 7;
        System.out.println("Last Occurence of Element" + " " +key+ ": "+findLastOccurence(arr, 0, key));
    }
    
}
