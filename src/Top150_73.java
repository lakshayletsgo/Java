import java.util.*;
public class Top150_73 {

        Map<Integer,Integer> map = new HashMap<>();
        int postOrderInd = 0;
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            for(int i=0;i<inorder.length;i++)map.put(inorder[i],i);
            postOrderInd = postorder.length-1;
            return helper(0,postorder.length-1,postorder);
        }
        private TreeNode helper(int i,int j,int []postorder){
            if(postOrderInd<0||i>j)return null;
            TreeNode node = new TreeNode(postorder[postOrderInd]);
            int index = map.get(postorder[postOrderInd--]);

            node.right = helper(index+1,j,postorder);
            node.left = helper(i,index-1,postorder);
            return node;

        }

}
