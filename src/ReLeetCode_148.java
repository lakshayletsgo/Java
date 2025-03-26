import java.util.PriorityQueue;

public class ReLeetCode_148 {
    public static void main(String[] args) {

    }
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int []dirX = {-1,1,0,0};
        int []dirY = {0,0,1,-1};
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->a[2]-b[2]);
        pq.add(new int[]{0,0,grid[0][0]});
        grid[0][0]=-1;

        while (!pq.isEmpty()){
            int[]temp=pq.poll();
            int r= temp[0];
            int c= temp[1];
            int max= temp[2];
            for (int x=0;x<4;x++){
                int i=r+dirX[x];
                int j=c+dirY[x];
                if (i==-1||j==-1||i==n||j==n||grid[i][j]==-1)continue;
                int val= grid[i][j];
                int maxI=Math.max(max,val);
                grid[i][j]=-1;
                if (i==n-1&&j==n-1)return maxI;
                pq.add(new int[]{i,j,maxI});
            }
        }
        return 0;


    }
}
