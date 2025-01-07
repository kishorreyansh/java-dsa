package flowcharts;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 5;
		int div = 2;
		
		while(div<no) {
			if(no % div == 0) {
				System.out.println("Not a Prime Number");
				break;
			}
			else {
				div = div + 1;
			}
		}
		System.out.println("It is Prime Number");

	}

}
