package loops;

import java.util.Scanner;

public class ContinueStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		do {
			int number = sc.nextInt();
			if(number % 10 == 0) {
				continue;
			}
			System.out.println(number);
		}while(true);
	}
}
