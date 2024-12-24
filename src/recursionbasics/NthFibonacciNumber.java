package recursionbasics;

public class NthFibonacciNumber {

    public static int printFibonacci(int n){
        if( n == 0){
            return 0;
        }
        if( n == 1){
            return 1;
        }
        int fibNminus1 = printFibonacci(n-1);
        int fibNminus2 = printFibonacci(n-2);
        int fibN = fibNminus1 + fibNminus2;
        return fibN;
    }

    public static void main(String[] args) {
        
        int n=6;
        System.out.println("Fibonacci: "+printFibonacci(n));

    }
    
}
