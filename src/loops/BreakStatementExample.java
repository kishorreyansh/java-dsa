package loops;

import java.util.Scanner;

public class BreakStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		do {
			int number = sc.nextInt();
			if(number % 10 == 0) {
				break;
			}
			System.out.println(number);
		}while(true);
	}

}
