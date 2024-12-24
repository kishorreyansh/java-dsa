package loops;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//n = root n * root n
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		boolean isPrime = true;
		
		if(no == 2) {
			System.out.println("Number is Prime");
		}else {
			for(int i=2; i <= Math.sqrt(no); i++) {
				if(no % i == 0) {
					isPrime = false;
				}
			}
			
			if(isPrime == true) {
				System.out.println("Number is Prime");
			}else {
				System.out.println("Number is not a Prime");
			}
		}
		
		
	}

}
