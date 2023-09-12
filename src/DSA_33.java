//Backtracking is that we make some changes in recursion call and when we return out of the recursion call the changes made should also be removed
//In this we are using backtracking
//When we come to the old matrix, no new changes should be there


import java.util.Arrays;

public class DSA_33 {
    public static void main(String[] args) {
        boolean[][] matrix = {
                {true,true,true},
                {true,true,true},
                {true,true,true}

        };
        int[][]arr = new int[matrix.length][matrix[0].length];
        allPathMatrix("",matrix,0,0,arr,1);
//        allPath("",matrix,0,0);
    }
    static void allPath(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1&&c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r<maze.length-1){
            allPath(p+'D',maze,r+1,c);
        }
        if(c<maze.length-1){
            allPath(p+'R',maze,r,c+1);
        }
        if(r>0){
            allPath(p+'U',maze,r-1,c);
        }
        if(c>0){
            allPath(p+'L',maze,r,c-1);
        }
        maze[r][c] = true;

    }
    static void allPathMatrix(String p, boolean[][] maze, int r, int c, int[][]path,int count){
        if(r==maze.length-1&&c==maze[0].length-1){

            path[r][c] = count;

            for(int []arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = count;
        if(r<maze.length-1){
            allPathMatrix(p+'D',maze,r+1,c,path,count+1);
        }
        if(c<maze.length-1){
            allPathMatrix(p+'R',maze,r,c+1,path,count+1);
        }
        if(r>0){
            allPathMatrix(p+'U',maze,r-1,c,path,count+1);
        }
        if(c>0){
            allPathMatrix(p+'L',maze,r,c-1,path,count+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;

    }

}
