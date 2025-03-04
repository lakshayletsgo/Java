import java.util.ArrayList;

public class ReLeetCode_119 {
    public static void main(String[] args) {

    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[]adj = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[]i:prerequisites){
            adj[i[0]].add(i[1]);
        }
        int[]visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(visited,adj,i))return false;
        }
        return true;
    }

    private boolean dfs(int[] visited, ArrayList<Integer>[] adj, int i) {
        if (visited[i]==1)return false;
        if (visited[i]==2)return true;
        visited[i]=1;
        for (int n:adj[i]){
            if (!dfs(visited,adj,n))return false;
        }
        visited[i] = 2;
        return true;
    }
}
