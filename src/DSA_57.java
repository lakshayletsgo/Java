//https://leetcode.com/problems/binary-tree-level-order-traversal/

//Breadth First Search
//In this we traverse the tree level by level
//First the root node and then its childeren
//Then from left to right like level by level

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class TreeNode27 {
       int val;
       TreeNode12 left;
       TreeNode12 right;
       TreeNode27() {}
       TreeNode27(int val) { this.val = val; }
       TreeNode27(int val, TreeNode12 left, TreeNode12 right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
public class DSA_57 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode12 root) {

//        Here we have return the ans in the form of ArrayList
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

//      This is the temp queue where we have store the ans to traverse it
        Queue<TreeNode12> queue= new LinkedList<>();

//        We have first stored the root node in the queue and as we move on we remove the root and add its child
        queue.offer(root);

//        This loop will run untill all the elements are removed and queue is empty
        while (!queue.isEmpty()){

//            This will give the number of the element at each level

            int levelSize = queue.size();
            List<Integer> levell = new ArrayList<>(levelSize);
            for(int i=0;i<levelSize;i++){
                TreeNode12 currentNode = queue.poll();
                levell.add(currentNode.val);
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            ans.add(levell);
        }
        return ans;
    }
}
