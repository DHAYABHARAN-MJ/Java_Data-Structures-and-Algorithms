package Algorithms.Searching;

import java.util.Scanner;
public class Search2DMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        int x = input.nextInt();
        boolean ans = Solution3.searchMatrix(matrix,x);
        System.out.println(ans);
    }
}
class Solution3 {
    public  static boolean searchMatrix(int[][] mat, int x) {
        int r = mat.length;
        int c = mat[0].length;
        int low = 0;
        int high = r*c-1;
        while(low<=high){
            int mid = (low+high)/2;
            int row = mid/c;
            int col = mid%c;
            if(mat[row][col]==x) return true;
            if(mat[row][col]<x) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}