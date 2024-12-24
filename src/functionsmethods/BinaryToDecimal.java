package functionsmethods;

public class BinaryToDecimal {

	public static void binaryToDecimal(int binNumber) {
		int myNo = binNumber;
		int power = 0;
		int decimalNo = 0;
		
		while(binNumber > 0) {
			int lastdigit = binNumber % 10;
			decimalNo = decimalNo + (lastdigit * (int)Math.pow(2, power));
			power++;
			binNumber = binNumber/10;
		}
		System.out.println("Binary Number: "+myNo + " = "+decimalNo);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryToDecimal(111);

	}

}
