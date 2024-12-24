package recursionbasics;

public class SumOfNNaturalNumbers {

    public static int sumOfNNaturalNumbers(int no){

        if(no == 1){
            return 1;
        }
        int sum = sumOfNNaturalNumbers(no -1);
        int value = no + sum;
        return value;
    }

    public static void main(String[] args) {
        
        int n=5;
        System.out.println("Sum of N Natural Numbers: "+sumOfNNaturalNumbers(n));

    }
    
}
