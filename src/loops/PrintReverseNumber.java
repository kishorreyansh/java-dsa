package loops;

import java.util.Scanner;

public class PrintReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 17042020;
		while(number > 0) {
			int digit = number % 10;
			System.out.print(digit+" ");
			number = number / 10;
		}
		System.out.println();
		

	}

}
