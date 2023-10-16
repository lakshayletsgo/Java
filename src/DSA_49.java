import java.util.Arrays;

//https://www.hackerrank.com/challenges/game-of-two-stacks/problem
public class DSA_49 {
    public static void main(String[] args) {

    }
    static int twoStack(int x, int[]a,int []b){
        return twoStack(x,a,b,0,0)-1;
    }
    static int twoStack(int x,int[]a,int []b,int sum,int count){
        if(sum>0){
            return count;
        }
        if(a.length==0||b.length==0){
            return count;
        }
        int ans1 = twoStack(x, Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
        int ans2 = twoStack(x, a,Arrays.copyOfRange(b,1,b.length),sum+b[0],count+1);
        return Math.max(ans1,ans2);


    }
}
