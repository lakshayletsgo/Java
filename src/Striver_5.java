import java.util.*;
public class Striver_5 {
    private class Pair{
        TreeNode node;
        int row, col;
        public Pair(TreeNode node, int row, int col){
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer,List<Pair>> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        int minCol = 0;
        int maxCol = 0;

        q.offer(new Pair(root,0,0));
        while (!q.isEmpty()){
            int qSize = q.size();
            for (int i=0;i<qSize;i++){
                Pair curr= q.poll();
                TreeNode node = curr.node;
                int currRow = curr.row;
                int currCol = curr.col;
                map.putIfAbsent(currCol,new ArrayList<>());
                map.get(currCol).add(curr);
                minCol = Math.min(minCol,currCol);
                maxCol = Math.max(maxCol,currCol);
                if (node.left!=null) q.offer(new Pair(node.left,currRow+1,currCol-1));
                if (node.right!=null) q.offer(new Pair(node.right,currRow+1,currCol+1));
            }

        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = minCol; i <= maxCol; i++) {
            List<Pair>temp = map.get(i);
            temp.sort((a,b)->{
                if (a.row != b.row) {
                    return a.row - b.row;
                } else {
                    return a.node.val - b.node.val;
                }            });
            List<Integer>colList=new ArrayList<>();
            for (Pair p:temp){
                colList.add(p.node.val);
            }
            list.add(colList);
        }
        return list;
    }
}
