package functionsmethods;

public class BinomialCoefficient {
	
	// Formula: ncr = n! / r!(n-r)!
	
	public static int factorial(int n) {
		int val = 1;
		for(int i=1; i <= n; i++) {
			val = val * i;
		}
		return val;
	}
	
	public static int binomialCoefficient(int n, int r) {
		int fact_n = factorial(n);
		int fact_r = factorial(r);

		int fact_nr = factorial(n-r);
		
		int bc = fact_n / (fact_r * fact_nr) ;
		return bc;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int r = 2;
		int bc = binomialCoefficient(n,r);
		System.out.println("Binomial Coefficient: "+bc);

	}

}
