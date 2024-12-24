package functionsmethods;

public class PrimeRange {
	
	public static boolean primeOptimized(int n) {
		if(n == 2) {
			return true;
		}
		for(int i=2; i<= Math.sqrt(n); i++) {
			if(n %i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void primeRange(int n) {
		for(int i=2; i<=n; i++) {
			boolean prime = primeOptimized(i);
			if(prime ==  true) {
				System.out.print(i+ " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		primeRange(n);

	}

}
