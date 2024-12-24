package sortingalgorithms;

public class InsertionSort {

    public static void insertionSort(int arrays[]){
        for(int i=1; i<arrays.length;i++){
            int curr = arrays[i];
            int prev = i-1;

            while(prev >= 0 && arrays[prev] > curr){
                arrays[prev+1] = arrays[prev];
                prev--;
            }
            arrays[prev+1] = curr;

        }
    }

    public static void printArray(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}


    public static void main(String[] args) {
         int arrays[] = { 5,3,1,4,2};

         insertionSort(arrays);
         printArray(arrays);
    }
    
}
