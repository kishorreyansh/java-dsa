package arrayspart1;

public class LargestInArray {
	
	public static int largestNumber(int numbers[]) {
		
		int largest = Integer.MIN_VALUE; //-Infinity
		
		for(int i=0; i<numbers.length;i++) {
			if(largest < numbers[i]) {
				largest = numbers[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = {23,24,5,17,1,13,18};
		
		int largest = largestNumber(numbers);
		System.out.println("Largest Number in Array: "+largest);
		
	}

}
