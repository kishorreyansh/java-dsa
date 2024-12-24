package recursionbasics;

public class Factorial {

    public static int printFactorial(int no){
        if( no == 0){
            return 1;
        }
        int value = printFactorial(no - 1);
        int factorialvalue = no * value;

        return factorialvalue;

    }

    public static void main(String[] args) {
        
        int n=4;
        System.out.println("Factorial Value: "+printFactorial(n));
    }
    
}
