package recursionbasics;

public class PrintNumbersDecreasingOrder {

    public static void printDecreasing(int no){
        if(no == 1){
            System.out.println(no);
            return;
        }
        System.out.print(no+ " ");
        printDecreasing(no -1);
    }

    public static void main(String[] args) {
        
        int n=10;

        //First Approach
        // for(int i=n; i>=1; i--){
        //     System.out.print(i+ " ");
        // }

        printDecreasing(n);
    }
    
}
