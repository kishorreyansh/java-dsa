package functionsmethods;

public class DecimalToBinary {
	
	public static void decimalToBin(int n) {
		int myNumber = n;
		int power = 0;
		int binNum = 0;
		
		while(n > 0) {
			int remainder = n % 2;
			binNum = binNum + (remainder * (int)Math.pow(10, power));
			power++;
			n = n/2; //quotient
		}
		System.out.println("Decimal Number: "+myNumber + " = "+binNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decimalToBin(7);
	}
}
