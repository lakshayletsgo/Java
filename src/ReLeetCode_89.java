import java.util.ArrayList;
import java.util.List;

public class ReLeetCode_89 {
    public static void main(String[] args) {

    }
    private int mod = 1000000007;
    public int numOfWays(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int n:nums) list.add(n);
        long ans = (mod+totalWays(list)-1)%mod;
        return (int) ans;
    }

    private long totalWays(List<Integer> list) {
        if (list.size()==0) return 1;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int head = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)<head){
                left.add(list.get(i));
            }else{
                right.add(list.get(i));
            }
        }
        long count = (totalWays(left)*totalWays(right))%mod;
        long combination = comb(list.size()-1,left.size());
        return (combination*count)%mod;

    }

    private long comb(int i, int size) {
        if (i==0)return 1;
        long[][]pascal = new long[i+1][size+1];
        pascal[0][0] = 1;
        for (int j = 1; j <=i; j++) {
            pascal[j][0] =1;
            for (int k = 1; k <= size; k++) {
                pascal[j][k] = (pascal[j-1][k-1]+pascal[j-1][k])%mod;
            }
        }
        return pascal[i][size];

    }
}
