//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
//In this we use Breadth first search
//We use the double ended queue
//We first add from last and then first
//To perform this we have to use a variable reverse whose value will change alternatively

import java.util.*;
public class LeetCode_41 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root==null){
            return ans;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse= false;
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i=0;i<levelSize;i++){
                if(!reverse){
                    TreeNode currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val);
                    if(currentNode.left!=null){
                        queue.addFirst(currentNode.left);
                    }
                    if(currentNode.right!=null){
                        queue.addFirst(currentNode.right);
                    }
                }else{
                    TreeNode currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);
                    if(currentNode.right!=null){
                        queue.addLast(currentNode.right);
                    }
                    if(currentNode.left!=null){
                        queue.addLast(currentNode.left);
                    }
                }
                reverse = !reverse;
            }
            ans.add(currentLevel);


        }
        return ans;


    }
}

