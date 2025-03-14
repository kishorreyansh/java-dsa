package twodarrays;

import java.util.Scanner;

public class Matrices {

    public static boolean searchElement(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("Element Found at ("+i+","+j+")");
                    return true;
                }
            }  
        }
        return false;
    }

    public static void main(String[] args) {
        
        int matrix[][] = new int[3][3];
        int n=3,m=3;

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        searchElement(matrix,4);
    }
}
