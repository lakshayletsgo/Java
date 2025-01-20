import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReLeetCode_68 {
    public static void main(String[] args) {

    }
    private class Pair{
        TreeNode key;
        int val;
        Pair(TreeNode key,int val){
            this.key = key;
            this.val = val;
        }
        TreeNode getKey(){
            return key;
        }
        int getVal(){
            return val;
        }
    }
    public int sumEvenGrandparent(TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,-1));
        int sum  =0;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Pair cur = queue.remove();
                int val = cur.getVal();
                TreeNode node = cur.getKey();
                if (node.left!=null){
                    if (val%2==0) sum+=node.left.val;
                    queue.add(new Pair(node.left,node.val));
                }
                if (node.right!=null){
                    if (val%2==0) sum+=node.right.val;
                    queue.add(new Pair(node.right,node.val));
                }
            }

        }
        return sum;
    }
}
