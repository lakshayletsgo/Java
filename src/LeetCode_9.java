//https://leetcode.com/problems/reverse-integer/
public class LeetCode_9 {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        if(x>Math.pow(2,31)-1||x<-Math.pow(2,31)){
            return 0;
        }
        long ans = 0;
        while (x!=0){
            int r = x%10;
            ans = ans*10 + r;
            x/=10;
        }
        if(ans>Math.pow(2,31)-1||x<-Math.pow(2,31)){
            return 0;
        }
        return (int)ans;
    }
}
