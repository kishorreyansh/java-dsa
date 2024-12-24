package sortingalgorithms;

public class CountingSort {
    
    public static void countingSort(int arr[]){

        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        //Iterating original Array
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        //Iterating counting Array
        for( int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

    public static void main(String[] args) {
        int arr[] = { 1,3,2,1,5,2,6,8};
        countingSort(arr);
        printArray(arr);
    }
}
