package backtracking;

public class BackTrackingOnArrays {

    public static void changeArray(int arr[], int i,  int val){

        //Base Case
        if(i == arr.length){
            printArray(arr);
            return;
        }

        arr[i] = val;
        changeArray(arr, i+1, val+1); //Recursive Function Call
        arr[i] = arr[i] - 2; // Backtracking 

    }

    public static void printArray(int arr[]){
        for(int i=0; i < arr.length; i++){
            System.err.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int arr[] = new int[5];
        changeArray(arr, 0, 1);
        printArray(arr);
    }
    
}