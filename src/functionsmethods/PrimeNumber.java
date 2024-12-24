package functionsmethods;

public class PrimeNumber {
	
//	public static boolean prime(int n) {
//		if(n == 2) {
//			return true;
//		}
//		boolean isPrime = true;
//		for(int i=2; i <= n-1; i++) {
//			if(n % i == 0) {
//				isPrime = false;
//			}
//		}
//		return isPrime;
//	}
	
	public static boolean primeOptimized(int n) {
		if(n == 2) {
			return true;
		}
		
		for(int i=2; i <= Math.sqrt(n); i++) {
			if(n %i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		boolean val = primeOptimized(n);
		if(val == true) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is Not Prime");
		}
	}

}
