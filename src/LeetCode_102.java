//https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/submissions/
import java.util.*;
public class LeetCode_102 {
   private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public static void main(String[] args) {

    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root==null){
            return ans;
        }
        int col =0;
        Queue<Map.Entry<TreeNode,Integer>> queue = new ArrayDeque<>();
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();

        queue.offer(new AbstractMap.SimpleEntry<>(root,col));
        int min = 0;
        int max = 0;
        while (!queue.isEmpty()){
            Map.Entry<TreeNode,Integer> removed= queue.poll();
            root = removed.getKey();
            col = removed.getValue();

            if(root!=null){
                if(!map.containsKey(col)){
                    map.put(col,new ArrayList<Integer>());
                }
                map.get(col).add(root.val);
                min = Math.min(min,col);
                max = Math.max(max,col);
                queue.offer(new AbstractMap.SimpleEntry<>(root.left,col-1));
                queue.offer(new AbstractMap.SimpleEntry<>(root.right,col+1));
            }
        }
        for(int i=min;i<=max;i++){
            ans.add(map.get(i));
        }

        return ans;
    }
}
