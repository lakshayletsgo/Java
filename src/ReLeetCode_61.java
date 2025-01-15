import java.security.KeyPair;
import java.util.ArrayDeque;
import java.util.Map;

public class ReLeetCode_61 {
    private class Pair{
        TreeNode node;
        int pos;
        Pair(TreeNode node,int pos){
            this.node = node;
            this.pos = pos;
        }
    }
    public static void main(String[] args) {

    }
    public int widthOfBinaryTree(TreeNode root) {
        if (root==null)return 0;
        int result = Integer.MIN_VALUE;
        ArrayDeque<Pair> deque= new ArrayDeque<>();
        deque.offer(new Pair(root,0));
        while (!deque.isEmpty()){
            int size = deque.size();
            result = Math.max(result,deque.getLast().pos-deque.getFirst().pos+1);
            for (int i = 0; i < size; i++) {
                Pair curr = deque.poll();
                TreeNode node = curr.node;
                int val  = curr.pos;
                if (node.left!=null) deque.add(new Pair(node.left,2*val+1));
                if (node.right!=null) deque.add(new Pair(node.right,2*val+2));
            }
        }
        return result;
    }
}
