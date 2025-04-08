import java.util.ArrayList;
import java.util.List;

public class ReLeetCode_168 {
    public static void main(String[] args) {

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans= new ArrayList<>();
        if (matrix.length==0)return ans;

        int rowB=0;
        int rowE=matrix.length-1;
        int colB=0;
        int colE=matrix[0].length-1;
        while (rowB<=rowE&&colB<=colE){
            for (int i=colB;i<=colE;i++)ans.add(matrix[rowB][i]);
            rowB++;
            for (int i=rowB;i<=rowE;i++)ans.add(matrix[i][colE]);
            colE--;
            if (rowB<=rowE)for (int i=colE;i>=colB;i--)ans.add(matrix[rowE][i]);
            rowE--;

            if (colB<=colE)for (int i=rowE;i>=rowB;i--)ans.add(matrix[i][colB]);
            colB++;
        }
        return ans;
    }
}
