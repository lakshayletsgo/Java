import java.util.*;
public class Top150_142 {
        public int minimumTotal(List<List<Integer>> triangle) {
            int height = triangle.size();
            int[][] DP = new int [height + 1][height + 1];

            for(int i = height - 1; i >= 0; i--){
                for(int j = 0; j <= i; j++){
                    DP[i][j] = triangle.get(i).get(j) + Math.min(DP[i + 1][j],DP[i + 1][j + 1]);

                }
            }
            return DP[0][0];
        }

}
