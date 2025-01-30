import java.util.HashMap;
import java.util.Map;

public class ReLeetCode_86 {
    public static void main(String[] args) {

    }
    int index = 0;
    public TreeNode recoverFromPreorder(String traversal) {
        return helper(traversal,0);
    }

    private TreeNode helper(String traversal, int i) {
        int temp = 0;
        while (index+temp<traversal.length()&&traversal.charAt(index+temp)=='-'){
            temp++;
        }

        if (temp!=i){
            return null;
        }
        int nd = 0;
        while (index+temp+nd<traversal.length()&&traversal.charAt(index + temp +nd)!='-'){
            nd++;
        }
        int val = Integer.parseInt(traversal.substring(index+temp,index+temp+nd));
        index +=temp+nd;
        TreeNode node  = new TreeNode(val);
        node.left = helper(traversal,i+1);
        node.right = helper(traversal,i+1);
        return node;
    }

}
