package conditionalstatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		//sc.next() comes string we need character
		char operator = sc.next().charAt(0);
		
		switch(operator) {
			case '+': System.out.println(a+b); break;
			case '-': System.out.println(a-b); break;
			case '*': System.out.println(a*b); break;
			case '/': System.out.println(a/b); break;
			case '%': System.out.println(a%b); break;
			default: System.out.println("Invalid Operator");
		}
		

	}

}
