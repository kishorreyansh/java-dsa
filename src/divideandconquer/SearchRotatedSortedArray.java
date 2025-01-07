package divideandconquer;

public class SearchRotatedSortedArray {

    public static int search(int arr[], int tar, int si,int ei){
        if(si > ei){
            return -1;
        }

        int mid = si + (ei-si)/2;
         
        //CASE FOUND
        if(arr[mid] == tar){
            return mid;
        }

        // Mid on L1
        if(arr[si] <= arr[mid]){

            // case a
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }else{
                return search(arr, tar, mid+1, ei);
            }

        }
        //Mid on L2
        else{
            //case c: Right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            //case d: Left
            else{
                return search(arr, tar, si, mid-1);
            }
        }

    }

    public static void main(String[] args) {
        
        int arr[] = {4,5,6,7,0,1,2};
        int target = 6;
        int targetIndex = search(arr,target,0,arr.length-1);
        System.out.println("Target: "+targetIndex);
    }
    
}
