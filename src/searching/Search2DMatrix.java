package searching;

/**
 * Involves two steps first findinu the row comparing the last and first elemnt of row to target and eliminating rows
 * binary seracg on found row
 * mistake i did - assuming square matrix and not sending colums
 */
public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int COLS = matrix[0].length;
        int top =0,bottom = matrix.length-1;
        int midRow =0;
        while(top<=bottom)
        {
            midRow = (top+bottom)/2;
            if(target>matrix[midRow][COLS-1])
                top = midRow+1;
            if(target<matrix[midRow][0])
                bottom = midRow-1;
            else
                break;

        }
        if(top>bottom)
            return false;
        else
            Search2DMatrix.binarySearch(matrix[midRow],target);
        return false;
    }
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length-1;
        int mid = 0;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(target==array[mid])
                return mid;
            if(target<array[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [][] matrix = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,3));
        int [][] matrix1=new int[][] {{1},{3}};
        System.out.println(searchMatrix(matrix1,3));
    }
}
