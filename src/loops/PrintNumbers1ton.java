package loops;

import java.util.Scanner;

public class PrintNumbers1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int no = 1;
		
		while(no <= number) {
			System.out.print(no+" ");
			no++;
		}

	}

}
