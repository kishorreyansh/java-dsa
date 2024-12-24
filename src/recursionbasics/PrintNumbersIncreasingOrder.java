package recursionbasics;

public class PrintNumbersIncreasingOrder {

    public static void printIncreasing(int no){
        if(no == 1){
            System.out.print(no+" ");
            return;
        }
        printIncreasing(no - 1);
        System.out.print(no + " ");
    }

    public static void main(String[] args) {
        int n=10;
        printIncreasing(n);
    }

    
    
}
