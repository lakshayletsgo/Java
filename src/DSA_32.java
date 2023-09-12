import java.util.ArrayList;

//Backtracking
//Maze Problem
//In this we have to give number of paths for a person to move cross a 2*2 matrix
//The thought proceess that we just decrease the size of matrix and keep decreasing it till either the row or column is 1
//If either the row or column is 1 then there is only one way possible
public class DSA_32 {
    public static void main(String[] args) {
        System.out.println(mazeProblem(2,2));
        printPath("",3,3);
        System.out.println(printPath2("",3,3));
    }
    static int mazeProblem(int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int left = mazeProblem(r,c-1);
        int down = mazeProblem(r-1,c);

        return left+down;
    }

    static void printPath(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            printPath(p+"D",r-1,c);
        }
        if(c>1){
            printPath(p+"R",r,c-1);
        }
    }

    static ArrayList<String> printPath2(String p,int r,int c){
        if(r==1&&c==1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1){
            ans.addAll(printPath2(p+"D",r-1,c));
        }
        if(c>1){
            ans.addAll(printPath2(p+"R",r,c-1));
        }
        return ans;
    }
}
