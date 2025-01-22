import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReLeetCode_72 {
    public static void main(String[] args) {

    }
    Map<Integer,TreeNode>map = new HashMap<>();
    Set<Integer> set = new HashSet<>();
    public TreeNode createBinaryTree(int[][] descriptions) {

        for (int[] level:descriptions){
            TreeNode curr = map.getOrDefault(level[0],new TreeNode(level[0]));
            set.add(level[1]);
            if (level[2]==1){
                curr.left = map.getOrDefault(level[1],new TreeNode(level[1]));
            }else{
                curr.right = map.getOrDefault(level[1],new TreeNode(level[1]));
            }
            map.put(level[0],curr);
        }
        int root = -1;
        for (int []level:descriptions){
            if (!set.contains(level[0])){
                root = level[0];
                break;
            }
        }
        return map.getOrDefault(root,null);
    }
}
