import java.util.LinkedList;
import java.util.Queue;

public class ReLeetCode_62 {
    public static void main(String[] args) {

    }
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int []map = new int[n];
        for (int i = 0; i < n; i++) {
            if (leftChild[i]!=-1)map[leftChild[i]]++;
            if (rightChild[i]!=-1)map[rightChild[i]]++;
        }
        int root= -1;
        for (int i = 0; i < n; i++) {
            if (map[i]==0)root=i;
        }
        if (root==-1)return false;
        Queue<Integer> q = new LinkedList<>();
        q.add(root);
        boolean [] vis= new boolean[n];
        while (!q.isEmpty()){
            int x = q.poll();
            if (vis[x])return false;
            vis[x] = true;
            if (leftChild[x]!=-1)q.add(leftChild[x]);
            if (rightChild[x]!=-1)q.add(rightChild[x]);
        }
        for (boolean i:vis) if (!i)return false;
        return true;
    }
}
