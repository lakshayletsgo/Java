import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

public class ReLeetCode_19 {
    public static void main(String[] args) {
        System.out.println(carFleet(12,new int[]{10,8,0,5,3},new int[]{2,4,1,1,3 }));
    }
    public static int carFleet(int target, int[] position, int[] speed) {
        int res = 0;
        double[] timeArr = new double[target];
        for (int i = 0; i < position.length; i++)
        {
            timeArr[position[i]]= (double)(target - position[i]) / speed[i];
        }
        double prev = 0.0;
        for (int i = target-1; i >=0 ; i--)
        {
            double cur = timeArr[i];
            if (cur > prev)
            {
                prev = cur;
                res++;
            }
        }
        return res;
    }
}
