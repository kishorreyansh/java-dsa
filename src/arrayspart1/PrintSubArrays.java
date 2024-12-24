package arrayspart1;

public class PrintSubArrays {
	
	public static void printSubArrays(int numbers[]) {
		int totalpairs = 0;
		for(int i=0; i<numbers.length; i++) {
			int start = i;
			for(int j=i; j<numbers.length;j++) {
				int end = j;
				for(int k=start; k<=end;k++) {
					System.out.print(numbers[k]+" ");
				}
				totalpairs++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total Pairs in SubArray: "+totalpairs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {2,4,6,8,10};
		printSubArrays(numbers);

	}

}
