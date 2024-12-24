package recursionbasicsadvanced;

public class TilingProblem {

    public static int tilingProblem(int n){
        if( n == 0 || n == 1){
            return 1;
        }
        //Vertical Choice
        int fnminus1 = tilingProblem(n-1);
        //Horizontal Choice
        int fnminus2 = tilingProblem(n-2);
        
        int totalways = fnminus1 + fnminus2;
        return totalways;
    }

    public static void main(String[] args) {
        System.out.println("Total Ways: "+tilingProblem(4));
    }
}
