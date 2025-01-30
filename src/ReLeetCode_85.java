import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReLeetCode_85 {
    public static void main(String[] args) {

    }
    public int magnificentSets(int n, int[][] edges) {
        List<Integer> [] list = new List[n+1];
        int[]degree = new int[n+1];
        for (int i = 0; i < n+1; i++) list[i] = new ArrayList<>();
        for (int[]edge:edges){
            list[edge[0]].add(edge[1]);
            list[edge[1]].add(edge[0]);
            degree[edge[0]]++;
            degree[edge[1]]++;
        }
        int []comp = new int[n+1];
        int component =1;
        int [][]res = new int[n+1][2];
        for (int i = 1; i < n+1; i++) {
            if (comp[i]!=0&&res[comp[i]][1]<degree[i])continue;
            if (comp[i]==0) comp[i] = component++;
            res[comp[i]][1] = degree[i];
            int[]grp = new int[n+1];
            Queue<Integer> q = new LinkedList<>();
            grp[i] = 1;
            q.offer(i);
            int m = 0;
            while (!q.isEmpty()){
                int size = q.size();
                for (int j = 0; j < size; j++) {
                    int node = q.poll();
                    comp[node] = comp[i];
                    m = Math.max(m,grp[node]);
                    for (int nd:list[node]){
                        if (grp[nd]==0){
                            grp[nd] = grp[node]+1;
                            q.offer(nd);
                        } else if (Math.abs(grp[nd] - grp[node]) != 1) {
                            return -1;
                        }
                    }
                }
            }
            res[comp[i]][0] = Math.max(res[comp[i]][0],m);

        }
        int ans = 0;
        for (int[]i:res){
            ans+=i[0];
        }
        return ans;
    }
}
