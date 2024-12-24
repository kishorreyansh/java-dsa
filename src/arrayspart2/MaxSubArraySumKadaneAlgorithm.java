package arrayspart2;

public class MaxSubArraySumKadaneAlgorithm {
	
	
	public static void kadane(int numbers[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0; i<numbers.length;i++) {
			currSum = currSum + numbers[i];
			
			//to handle all negative numbers
			if(maxSum < currSum) {
				maxSum = currSum;
			}
			
			if(currSum < 0) {
				currSum = 0;
			}
			//If all are not negative then uncomment below line
			//maxSum = Math.max(maxSum,currSum);
		}
		System.out.println("Maximum SubArray Sum: "+maxSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int numbers[] = { -2,-3,4,-1,-2,1,5,-3};
		
		int numbers1[] = { -2,-3,4,-1,-2,1,5,-3};
		//int numbers2[] = { -2,-3,-5,-1,-4,-7};
		kadane(numbers1);
		//kadane(numbers2);

	}

}
