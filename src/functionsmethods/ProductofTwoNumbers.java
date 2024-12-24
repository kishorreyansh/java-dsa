package functionsmethods;

public class ProductofTwoNumbers {
	
	public static int multiply(int a, int b) {
		int multiplyVal = a * b;
		return multiplyVal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 5;
		int value = multiply(a,b);
		System.out.println("Product of a and b: " +value);

	}

}
