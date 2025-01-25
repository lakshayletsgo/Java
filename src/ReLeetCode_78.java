import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReLeetCode_78 {
    public static void main(String[] args) {

    }
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> ans = new ArrayList<>();
        if (label==1){
            ans.add(label);
            return ans;
        }
        while (label!=1){
            ans.add(label);
            int level = (int) (Math.log(label)/Math.log(2)) +1;
            int num;
            if (level%2==0){
                int dist = (int)Math.pow(2,level) -1-label;
                 num = (int) Math.pow(2,level-1)+dist;
            }else{
                int dist = label-(int)Math.pow(2,level-1);
                 num = (int)Math.pow(2,level)-1-dist;
            }
            label = num/2;
        }
        ans.add(label);
        Collections.reverse(ans);
        return ans;
    }
}
