//https://leetcode.com/problems/friends-of-appropriate-ages/description/
import java.util.Arrays;

public class LeetCode_17 {
    public static void main(String[] args) {
        int []arr = {16,16};
        System.out.println(numFriendRequests(arr));
    }
    public static int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int n = ages.length, ans = 0;
        int [] cnt = new int[121];
        for (int i = 0; i<n; i++) {
            int lo = 0, hi = i-1, res = -1;
            while (lo<=hi) {
                int mid = (lo+hi)/2;
                if (0.5*ages[i]+7.0>=ages[mid]) {
                    lo = mid+1;
                }
                else {
                    hi = mid-1;
                    res = mid;
                }
            }
            if (res!=-1) {
                ans+=(i-res);
                ans+=cnt[ages[i]];
            }
            cnt[ages[i]]++;
        }
        return ans;
    }
}
