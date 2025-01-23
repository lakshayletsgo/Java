import java.time.temporal.Temporal;
import java.util.*;

public class ReLeetCode_73 {
    public static void main(String[] args) {

    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> ans = new  ArrayList<>();
        inorder(root1,list1);
        inorder(root2,list2);
        ans.addAll(list1);
        ans.addAll(list2);
        Collections.sort(ans);
        return ans;

    }
    void inorder(TreeNode root, List<Integer>list){
        if (root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}
