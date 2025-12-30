package MathsProblems;

class Solution {
     public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        // if (n==1) return 1;
         int top =0,left =0,right =n-1,bottom = n-1;
         int val = 1;

        while(left <= right && top <= bottom){
            for(int i=left;i<=right;i++){
                matrix[top][i] = val++;
            }
            top++;
            for(int i =top;i<=bottom;i++){
                matrix[i][right]=val++;
            }
            right--;
            if(top <=bottom && left <=right){
            for(int i=right;i>=left;i--){
                matrix[bottom][i] =val++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
               matrix[i][left]=val++;
            }
            left++;
            }
        }
        return matrix;
    }
}
public class Sprialmatrix {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 3;  
        int[][] result = obj.generateMatrix(n);
        System.out.println("Spiral Matrix:");
        for (int[] row : result) {      
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
