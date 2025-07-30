import java.util.*;
public class Top150_74 {
    public Node connect(Node root) {
        if(root==null)return root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            while(levelSize-->0){
                Node curr = queue.poll();
                if(levelSize!=0)curr.next = queue.peek();
                if(curr.left!=null)queue.add(curr.left);
                if(curr.right!=null)queue.add(curr.right);
            }

        }
        return root;
    }
}
