import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Successor of the Tree Node
// In this we have to return the next node of the target node
// We do the breadth search in this
//If we find the node we return from that point and print the next child or the next node
public class DSA_58 {
    public static void main(String[] args) {

    }
    public static TreeNode Successor(TreeNode root, int key){
        if(root==null){
            return null;
        }
        Queue<TreeNode> queue  = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(current.left!=null){
                queue.offer(current.left);
            }
            if(current.right!=null){
                queue.offer(current.right);
            }
            if(current.val == key){
                break;
            }

        }
        return queue.peek();

    }

}
