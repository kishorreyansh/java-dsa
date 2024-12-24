package recursionbasics;

public class OptimizedXPowerN {

    public static int printOptimizedXPowerN(int x,int n){
        if( n == 0){
            return 1;
        }

        //n is even
        int halfPower = printOptimizedXPowerN(x,n/2);
        int halfPowerSquare = halfPower * halfPower;

        // n is odd
        if( n %2 != 0){
            halfPowerSquare = x * halfPowerSquare;
        }
        return halfPowerSquare;
    }

    public static void main(String[] args) {
        
        int x = 2;
        int n = 100;
        System.out.println("Optimized X Power N: "+printOptimizedXPowerN(x,n));
    }
    
}
