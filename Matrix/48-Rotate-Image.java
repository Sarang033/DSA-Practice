class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0 ; i < matrix.length;i++){
            for(int j = i; j < matrix[i].length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int[] row: matrix){
            int l =0 ;
            int r = row.length-1;
            while(l < r){
                int temp = row[l];
                row[l]=row[r];
                row[r]=temp;
                l++;
                r--;
            }
        }
    }
}