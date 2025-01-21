import java.util.ArrayList;
import java.util.List;

public class ReLeetCode_69 {
    public static void main(String[] args) {

    }

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getValuesInOrder(root,list);
        return constructorBalancedTree(list,0,list.size());
    }

    private TreeNode constructorBalancedTree(List<Integer> list, int i, int size) {
        if (i>size){
            return null;
        }
        int mid = i+(size-i)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left=  constructorBalancedTree(list,i,mid-1);
        root.right=  constructorBalancedTree(list,mid+1,size);
        return root;
    }

    private void getValuesInOrder(TreeNode root, List<Integer> list) {
        if (root==null) return;
        getValuesInOrder(root.left,list);
        list.add(root.val);
        getValuesInOrder(root.right,list);
    }
}
