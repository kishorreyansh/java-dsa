package recursionbasicsadvanced;

public class BinaryStringsConsecutiveZeros {

    public static void printBinStringsConsecutiveZeros(int n , int lastPlace, String str){

        if( n == 0){
            System.out.println(str);
            return;
        }
        printBinStringsConsecutiveZeros(n-1, 1, str+"1");
        if(lastPlace == 1){
            printBinStringsConsecutiveZeros(n-1, 0, str+"0");
        }
    }

    public static void main(String[] args) {
        printBinStringsConsecutiveZeros(4, 0, "");
    }
    
}
