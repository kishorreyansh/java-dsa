package arrayspart2;

public class MaxSubArraySumBruteForce {
	
	public static void maxSubArraySum(int numbers[]) {
		int currentSum = 0;
		int maximumSum = Integer.MIN_VALUE; // -infinity
		
		for(int i=0; i<numbers.length;i++) {
			int start=i;
			for(int j=i; j<numbers.length;j++) {
				int end=j;
				currentSum = 0;
				for(int k=start; k<=end;k++) {
					//System.out.print(numbers[k]+" ");
					currentSum += numbers[k];
				}
				System.out.println(currentSum);
				if(maximumSum  < currentSum) {
					maximumSum = currentSum;
				}
			}
		}
		System.out.println("Maximum Sum in SubArray: "+maximumSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[]= {1,-2,6,-1,3};
		maxSubArraySum(numbers);

	}

}
