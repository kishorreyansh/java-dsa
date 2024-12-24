package arrayspart1;

public class SmallestNumberInArray {
	
	public static int smallestNumber(int numbers[]) {
		
		int smallest = Integer.MAX_VALUE;
		
		for(int i=0; i <numbers.length;i++) {
			if(smallest > numbers[i]) {
				smallest = numbers[i];
			}
		}
		return smallest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {2,5,9,23,17,1};
		
		int smallest = smallestNumber(numbers);
		System.out.println("Smallest Number in Array: "+smallest);

	}

}
