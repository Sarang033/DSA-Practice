class Solution {
    public boolean exist(char[][] board, String word) {
        for(int r = 0 ; r < board.length ; r++){
            for(int c = 0 ; c < board[0].length; c++){
                if(board[r][c] == word.charAt(0)){
                    boolean found = dfs(board,r,c,word,0);
                    if(found) return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] matrix, int r, int c, String word, int wordIdx) {
        if (wordIdx == word.length()) {
            return true;
        }
        if (r<0||r>=matrix.length||c < 0||c >= matrix[0].length ) {
            return false;
        }
        if(matrix[r][c] == ' '|| matrix[r][c]!= word.charAt(wordIdx)){
            return false;
        }
        char ch = matrix[r][c];
        matrix[r][c] = ' ';
        if (dfs(matrix, r - 1, c, word, wordIdx + 1) 
         || dfs(matrix, r , c + 1, word, wordIdx + 1)
         || dfs(matrix, r + 1, c, word, wordIdx + 1) 
         || dfs(matrix, r, c - 1, word, wordIdx + 1)
         ) {
            return true;
        }

        matrix[r][c] = ch;
        return false;
    }
}