package loops;

public class ReverseGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 170489;
		int reverse = 0;
		while(n > 0) {
			int lastdigit = n % 10;
			reverse = (reverse * 10) + lastdigit;
			n = n / 10;
		}
		System.out.println("Reverse Number: "+reverse);
	}

}
