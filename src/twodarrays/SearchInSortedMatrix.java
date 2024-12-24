package twodarrays;

public class SearchInSortedMatrix {

    public static boolean searchSortedMatrix(int matrix[][],int key){
        //Column Wise Approach
        // int row=0, column = matrix[0].length-1;
        // while(row <= matrix.length && column >= 0){
        //     if(matrix[row][column] == key){
        //         System.out.println("Element Found at (" +row+ "," +column +")");
        //         return true;
        //     }else if(key < matrix[row][column]){
        //         column--;
        //     }else{
        //         row++;
        //     }
        // }
        // System.out.println("Element Not Found");
        // return false;

        //Rowwise Approach
        int row=matrix.length-1,column=0;
        while(row >=0 && column <= matrix.length){
            if(matrix[row][column] == key){
                System.out.println("Element Found at (" +row+ "," +column +")");
                return true;
            }else if( key < matrix[row][column]){
                row--;
            }else{
                column++;
            }
        }
        System.out.println("Element Not Found");
        return false;

    }
    
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50},
                        };
        //int key = 33; //Column Wise
        int key = 30;
        searchSortedMatrix(matrix,key);
    }
}
