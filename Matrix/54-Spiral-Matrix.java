class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int minr = 0;
        int maxr = matrix.length-1;
        int minc = 0;
        int maxc = matrix[0].length-1;

        while(list.size() < matrix.length * matrix[0].length){
            for(int i = minr ; i<= maxc; i++){
                list.add(matrix[minr][i]);
            }
            for(int i = minr+1 ; i<= maxr; i++){
                list.add(matrix[i][maxc]);
            }
           if(minr != maxr){
                for(int i = maxc-1 ; i>= minc ; i--){
                    list.add(matrix[maxr][i]);
                }
            }
            if(minc != maxc){
                for(int i = maxr - 1; i>=minr + 1; i--){
                    list.add(matrix[i][minc]);
                }
            }
            minr++;
            maxr--;
            minc++;
            maxc--;
        }
        return list;
    }
}