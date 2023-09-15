//Sudoku Solver
//To print it to have to put a if check condition in the main method and check if it can be solved and just print the sudoku
public class DSA_36 {
    public static void main(String[] args) {

    }
    static boolean solve(int[][]board){
        int n=board.length;
        int row=  -1;
        int col = -1;
        boolean emptyLeft = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptyLeft = false;
                    break;
                }
            }
            if(emptyLeft==false){
                break;
            }
        }
        if(emptyLeft==true){
            return true;

        }
        for(int number = 1;number<=9;number++){
            if(isSafe(board,row,col,number)){
                board[row][col]  = number;
                if(solve(board)){
                    return true;
                }else{
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    static void display(int [][]board){
        for(int []row:board){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][]board, int row,int col,int num){
//        Check the row
        for(int i=0;i<board.length;i++){
//            Check if the number is in the row
            if(board[row][i]==num){
                return false;
            }
        }
        for(int []nums:board){
            if(nums[col]==num){
                return false;
            }
        }
        int sqrt = (int)(Math.sqrt(board.length));
        int start = row-row%sqrt;
        int end = col- col%sqrt;
        for(int r=start;r<start+sqrt;r++){
            for(int c=end;c<end+sqrt;c++){
                if(board[r][c]==num){
                    return false;
                }
            }
        }
        return true;
    }
}
