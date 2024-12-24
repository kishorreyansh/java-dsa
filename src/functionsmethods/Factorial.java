package functionsmethods;

public class Factorial {
	
	public static int factorial(int n) {
		int val = 1;
		for(int i=1; i<=n; i++) {
			val = val * i;
		}
		return val;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int value = factorial(n);
		System.out.println("Factorial: " + value);

	}

}
