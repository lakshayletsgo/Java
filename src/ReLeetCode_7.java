public class ReLeetCode_7 {
    public static void main(String[] args) {
        System.out.println(isValidSudoku(new char[][]{{'8','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'}
,{'.','9','8','.','.','.','.','6','.'}
,{'8','.','.','.','6','.','.','.','3'}
,{'4','.','.','8','.','3','.','.','1'}
,{'7','.','.','.','2','.','.','.','6'}
,{'.','6','.','.','.','.','2','8','.'}
,{'.','.','.','4','1','9','.','.','5'}
,{'.','.','.','.','8','.','.','7','9'}}));
    }
    public static boolean isValidSudoku(char[][] board) {
        int[]pos = {0,0};
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                if(board[i][j]!='.'&&(!isValidInHorizon(board,i,j)||!isValidInVertical(board,i,j)||!isValidInABox(board,i,j))){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isValidInHorizon(char[][]board,int posI, int posJ){
        for (int i=0;i< board.length&&i!=posJ;i++){
            if(board[posI][i]==board[posI][posJ]){
                return false;
            }
        }
        return true;
    }
    public static boolean isValidInVertical(char[][]board,int posI, int posJ){
        for (int i=0;i<board.length&&i!=posI;i++){
            if(board[i][posJ]==board[posI][posJ]){
                return false;
            }
        }
        return true;
    }
    public static boolean isValidInABox(char[][]board, int posI, int posJ){
        int i2=posI-posI%3;
        int j2=posJ-posJ%3;
        for (int i=i2;i<i2+3;i++){
            for (int j=j2;j<j2+3;j++){
                if(i==posI){
                    if(j==posJ){
                        continue;
                    }
                }
                if(board[posI][posJ]==board[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
