import java.util.*;

public class ReLeetCode_80 {
    public static void main(String[] args) {

    }
        int swaps= 0;
        public int minimumOperations(TreeNode root) {
            if (root==null) return 0;
            List<List<Integer>> list = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()){
                int levelSize = queue.size();
                List<Integer> level = new ArrayList<>();
                for (int i = 0; i < levelSize; i++) {
                    TreeNode curr = queue.poll();
                    level.add(curr.val);
                    if (curr.left!=null) queue.add(curr.left);
                    if (curr.right!=null) queue.add(curr.right);
                }
                list.add(level);
                int []temp = new int[levelSize];
                int k=0;
                for (int val:level){
                    temp[k++] = val;
                }
                minSwaps(temp,k);

            }

            return swaps;
        }

        private void swap(int[]level,int f,int l){
            int temp= level[f];
            level[f]= level[l];
            level[l]=temp ;
        }
        private void minSwaps(int[] level,int k) {
            int[]temp = Arrays.copyOf(level,k);
            Arrays.sort(temp);
            for (int i=0;i<k;i++){
                if (level[i]!=temp[i]){
                    swaps++;
                    swap(level,i,indexOf(level,temp[i]));
                }
            }
        }

        private int indexOf(int[] level, int element) {
            for (int i=0;i<level.length;i++){
                if (element==level[i])return i;
            }

            return -1;
        }

}
