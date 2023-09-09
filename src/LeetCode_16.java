//https://leetcode.com/problems/arranging-coins/
public class LeetCode_16 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1957747793));
    }
    public static int   arrangeCoins(int n) {
        int r=0;
        for(int i=1;i<=n;i++){
            n-=i;
            r++;
        }
        return r;
    }
}
