package patternsadvanced;

public class FloydTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int counter = 1;
		for(int i=1; i <= n; i++) {
			for(int j=1; j<=i; j++ ) {
				System.out.print(counter+ " ");
				counter++;
			}
			System.out.println();
		}

	}

}
