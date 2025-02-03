import java.util.HashMap;
import java.util.Map;

public class ReLeetCode_88 {
    public static void main(String[] args) {

    }
    Map<Integer,Integer> removed = new HashMap<>();
    Map<Integer,Integer> left = new HashMap<>();
    Map<Integer,Integer> right = new HashMap<>();

    public int[] treeQueries(TreeNode root, int[] queries) {
        populateHeights(root,0);
        populateRemoved(root,0);
        int []ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = removed.get(queries[i]);
        }
        return ans;


}

    private void populateRemoved(TreeNode root, int i) {
        if (root==null){
            return;
        }
        removed.put(root.val,0);
        populateHeights(root.left,Math.max(i,left.get(root.val)));
        populateHeights(root.right,Math.max(i,right.get(root.val)));
    }

    private int populateHeights(TreeNode root, int i) {
        if (root==null){
            return i-1;
        }

        left.put(root.val,populateHeights(root.left,i+1));
        right.put(root.val,populateHeights(root.right,i+1));

        return Math.max(left.get(root.val),right.get(root.val));

    }
}
