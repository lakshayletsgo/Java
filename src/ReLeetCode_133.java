import java.util.Arrays;

public class ReLeetCode_133 {
    public static void main(String[] args) {

    }
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[]res = new int[3];
        for(int[]arr:triplets)if (arr[0]<=target[0]&&arr[1]<=target[1]&&arr[2]<=target[2]) res=  new int[]{Math.max(res[0],arr[0]),Math.max(res[1],arr[1]),Math.max(res[2],arr[2])};
        return Arrays.equals(res,target);
    }
}
