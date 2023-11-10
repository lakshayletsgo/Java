//https://leetcode.com/problems/average-of-levels-in-binary-tree/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_40 {
    public static void main(String[] args) {
//        System.out.println();
    }
    public List<Double> averageOfLevels(TreeNode12 root) {
        List<Double> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode12> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            double avg = 0;
            int levelSize = queue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode12 currentNode=  queue.poll();
                avg+=currentNode.val;
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            avg/=levelSize;
            ans.add(avg);


        }
        return ans;

    }
}

