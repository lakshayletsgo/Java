////https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
//
////In this we just append the begining of the array, at every level
//import com.sun.source.tree.Tree;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//class TreeNode{
//    TreeNode left;
//    TreeNode right;
//    int val;
//    public TreeNode(int val){
//        this.val = val;
//    }
//}
//public class LeetCode_42 {
//    public static void main(String[] args) {
//
//    }
//    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//        List<List<Integer>> ans = new ArrayList<>();
//        if(root==null){
//            return ans;
//        }
//        Queue<TreeNode> queue= new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()){
//            int levelSize = queue.size();
//            List<Integer> currentLevel = new ArrayList<>(levelSize);
//            for(int i=0;i<levelSize;i++){
//                TreeNode currentNode = queue.poll();
//                currentLevel.add((currentNode.val));
//                if(currentNode.left!=null){
//                    queue.offer(currentNode.left);
//                }
//                if(currentNode.right!=null){
//                    queue.offer(currentNode.right);
//                }
//
//            }
//            ans.add(0,currentLevel);
//        }
//        return ans;
//    }
//}
//
