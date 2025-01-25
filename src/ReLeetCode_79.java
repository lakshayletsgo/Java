import java.util.*;

public class ReLeetCode_79 {
    public static void main(String[] args) {

    }
    public TreeNode replaceValueInTree(TreeNode root) {
        List<Integer> sum = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int queueSize = queue.size();
            int temp  =0;
            for (int i = 0; i < queueSize; i++) {
                TreeNode curr = queue.poll();
                temp += curr.val;
                if (curr.left!=null) queue.add(curr.left);
                if (curr.right!=null) queue.add(curr.right);
            }
            sum.add(temp);
        }

        change(root,0,sum);
        root.val= 0;
        return root;
    }

    private void change(TreeNode root, int i, List<Integer> sum) {
        if (root==null)return;
        if (root.left==null&&root.right==null)return;
        if (root.left==null) root.right.val = sum.get(i)-root.right.val;
        else if (root.right==null) root.left.val = sum.get(i)-root.left.val;
        else {
            int total = sum.get(i) - root.left.val-root.right.val;
            root.right.val = total;
            root.left.val = total;
        }
        change(root.left,i+1,sum);
        change(root.right,i+1,sum);
    }
}
