import java.util.*;

public class ReLeetCode_93 {
    public static void main(String[] args) {

    }
    public TreeNode canMerge(List<TreeNode> trees) {
        Set<Integer> leafNodes = new HashSet<>();
        for (TreeNode curr:trees){
            if (curr.left!=null) leafNodes.add(curr.left.val);
            if (curr.right!=null) leafNodes.add(curr.right.val);
        }
        TreeNode root = null;
        for (TreeNode curr:trees){
            if (!leafNodes.contains(curr.val)){
                root = curr;
            }
        }
        if (root==null)return null;
        Map<Integer,TreeNode> treeMap = new HashMap<>();
        for (TreeNode curr:trees)
            if (root!=curr)treeMap.put(curr.val,curr);

        mergeBst(root,treeMap);
        if (validateBst(root,new int[]{-1})&&treeMap.size()==0)return root;
        return null;
    }

    private boolean validateBst(TreeNode root, int[] ints) {
        if (root!=null){
            if (!validateBst(root.left,ints))return false;
            if (ints[0]!=-1&&root.val<=ints[0])return false;
            ints[0] =root.val;
            return validateBst(root.right,ints);
        }return true;

    }

    private TreeNode mergeBst(TreeNode root, Map<Integer, TreeNode> treeMap) {
        if (root==null)return null;
        if (treeMap.containsKey(root.val)){
            TreeNode node = treeMap.get(root.val);
            root.left = node.left;
            root.right = node.right;
            treeMap.remove(root.val);
        }
        root.left = mergeBst(root.left,treeMap);
        root.right = mergeBst(root.right,treeMap);
        return root;


    }
}
