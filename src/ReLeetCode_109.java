public class ReLeetCode_109 {
    public static void main(String[] args) {

    }
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean[][]visited = new boolean[row][col];
        boolean result = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j]==word.charAt(0))
                    if (helper(board,visited,word,i,j,0))return true;
            }
        }
        return false;
    }

    private boolean helper(char[][] board,boolean[][]visited, String word, int i, int j, int i1) {
        if (i1 ==word.length())return true;
        if (i<0||i>=board.length||j<0||j>=board[0].length||visited[i][j]||board[i][j]!=word.charAt(i1))return false;
        visited[i][j] = true;
        if (helper(board,visited,word,i+1,j,i1+1)||helper(board,visited,word,i-1,j,i1+1)||helper(board,visited,word,i,j+1,i1+1)||helper(board,visited,word,i,j-1,i1+1))return true;
        visited[i][j] = false;
        return false;
    }
}
