package recursionbasics;

public class PrintXPowerN {

    public static int printXPowerN(int x, int n){
        if( n == 0){
            return 1;
        }
        return x * printXPowerN(x,n-1);
    }

    public static void main(String[] args) {
        
        int x = 2, n = 5;
        System.out.println("X Power N : "+printXPowerN(x,n));
    }
    
}
