//https://leetcode.com/problems/happy-number/submissions/
//Happy number is a number which will become one on multiple addition of its digits
//For eg = 100
// 19 --> 1+81--> 64+4-->36+64--> 100 -->1
// In this we move the fast and slow pointer and check if it is a loop or not
//If it is loop then the number is not a happy number else it is
public class LeetCode_31 {
    public static void main(String[] args) {

    }
    public boolean isHappy(int n) {
        int slow =n;
        int fast = n;
        do{
            slow = squareOf(slow);
            fast = squareOf(squareOf(fast));
        }
        while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }
    public int squareOf(int n){
        int ans=0;
        while(n!=0){
            int r= n%10;
            ans+=r*r;
            n/=10;

        }
        return ans;
    }

}
