import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReLeetCode_71 {
    public static void main(String[] args) {

    }
    private Map<Integer,List<TreeNode>> map = new HashMap<>();
    public List<TreeNode> allPossible(int n){
        List<TreeNode> list = new ArrayList<>();
        if (n==1){
            list.add(new TreeNode(0));
        } else if (n%2==1) {
            for (int i=0;i<n;i++){
                int j = n-1-i;
                for (TreeNode left : allPossible(i)){
                    for (TreeNode right:allPossible(j)){
                        TreeNode root = new TreeNode(0);
                        root.left = left;
                        root.right = right;
                        list.add(root);
                    }
                }
            }
        }
        map.put(n,list);
        return map.get(n);
    }

}
