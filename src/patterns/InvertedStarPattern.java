package patterns;

public class InvertedStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
//		for(int i=n; i>=1; i--) {
//			for(int j=1; j<=i; j++ ) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//Second Approach
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
