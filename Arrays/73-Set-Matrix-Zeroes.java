class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        for(int i =0 ;i< matrix.length; i++){
            for(int j=0 ; j< matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i =0 ;i< row.size(); i++){
            int idx = row.get(i);
            for(int j=0 ; j< matrix[0].length; j++){  // columns ko zero karo
                matrix[idx][j] = 0;
            }
        }
        for(int i =0 ;i< col.size(); i++){
            int idx = col.get(i);
            for(int j=0 ; j< matrix.length; j++){ // rows ko zero karo
                matrix[j][idx] = 0;
            }
        }
        return;
    }
}