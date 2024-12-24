package variablesDatatypes;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.err.println("Enter Pen value:");
		int pen = sc.nextInt();
		System.err.println("Enter Pencil value:");
		int pencil = sc.nextInt();
		System.err.println("Enter Eraser value:");
		int eraser = sc.nextInt();
		
		int bill = pen + pencil + eraser;
		System.out.println("Bill: "+bill);

		float newBill = bill + (0.18f * bill);
		//gst = (bill * 18 /100);
		System.out.println("New Bill Including Taxes: "+ newBill);

	}

}
