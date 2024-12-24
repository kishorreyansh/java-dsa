package arrayspart1;

public class PairsInArray {
	
	public static void pairsArray(int numbers[]) {
		
		int totalPairs = 0;
		for(int i=0; i<numbers.length;i++) {
			int curr = numbers[i];
			for(int j=i+1; j<numbers.length;j++) {
				System.out.print("(" + curr + "," + numbers[j] + ")");
				totalPairs++;
			}
			System.out.println();
		}
		System.out.println("Total Pairs in Array: "+totalPairs); //n(n-1)/2
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {2,4,6,8,10};
		System.out.println("Pairs in Array: ");
		pairsArray(numbers);

	}

}
