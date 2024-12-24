package arrayspart1;

public class ReverseArray {
	
	public static void reverseArray(int numbers[]) {
		
		int first=0;
		int last = numbers.length -1;
		while(first < last) {
			int temp = numbers[last];
			numbers[last] = numbers[first];
			numbers[first] = temp;
			
			first++;
			last--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = { 2,4,6,8,10,12};
		
		reverseArray(numbers);
		
		System.out.println("Reverse Array:");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+ " ");
		}
		System.out.println();
		

	}

}
