package twodarrays;

public class DiagonalSum {

    // Brute Force Approach : T(C)=O(n^2)  
    public static int printDiagonalSum(int matrix[][]){
        int sum = 0;
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(i == j){
                    sum += matrix[i][j];   
                }else if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
    //Second Approach: T(C)=O(n)
    public static int printDiagonalSum1(int matrix[][]){
        int sum = 0;
        for(int i=0; i<matrix.length;i++){
            //Primary Diagonal
            sum+= matrix[i][i];

            //Secondary Diagonal
            if(i != matrix.length-1-i)
                sum+= matrix[i][matrix.length-i-1];


        }
        return sum;
    }
    
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16},
                        };
        System.out.println("Brute Force Diagonal Sum: "+printDiagonalSum(matrix));
        System.out.println("Optimized Diagonal Sum: "+printDiagonalSum1(matrix));
    }
}
