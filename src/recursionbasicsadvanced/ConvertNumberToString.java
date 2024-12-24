package recursionbasicsadvanced;

public class ConvertNumberToString {

    public static void convertNoToString(int n){
        String numbers[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(n == 0){
            return;
        }
        int lastDigit = n%10;
        convertNoToString(n/10);
        System.out.print(numbers[lastDigit]+" ");
    }

    public static void main(String[] args) {
        int n=2020;
        convertNoToString(n);

    }
    
}
