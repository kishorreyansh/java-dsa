package conditionalstatements;

import java.util.Scanner;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int income = sc.nextInt();
		int tax;
		if(income < 50000) {
			tax = 0;
		}
		else if(income >= 50000 && income < 1000000) {
			tax = (int)(0.20 * income);
		}else {
			tax = (int)(0.30 * income);
		}
		System.out.println("Tax: "+tax);

	}

}
