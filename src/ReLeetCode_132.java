import java.lang.reflect.Array;
import java.util.Arrays;

public class ReLeetCode_132 {
    public static void main(String[] args) {

    }
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (groupSize==0||hand.length<=0||hand.length%groupSize!=0)return false;
        int n = hand.length;
        Arrays.sort(hand);
        for (int i=0;i<n;i++){
            if (hand[i]>=0&&!hasSuccessor(hand,groupSize,i,n))return false;
        }
        return true;
    }

    private boolean hasSuccessor(int[] hand, int groupSize, int i, int n) {
        int succ = hand[i]+1;
        hand[i]=-1;
        int cnt=1;
        i+=1;
        while (i<n&&cnt<groupSize){
            if (hand[i]==succ){
                succ= hand[i]+1;
                hand[i]=-1;
                cnt++;
            }
            i++;
        }
        return cnt==groupSize;

    }
}
