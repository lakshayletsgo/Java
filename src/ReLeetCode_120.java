import java.util.LinkedList;

public class ReLeetCode_120 {
    public static void main(String[] args) {

    }
    int orderIndx ;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        boolean []visited = new boolean[numCourses];
        boolean[]rec = new boolean[numCourses];
        int[]order = new int[numCourses];
        orderIndx = numCourses-1;
        LinkedList<Integer>[]graph = new LinkedList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new LinkedList<>();
        }
        for (int i=0;i<prerequisites.length;i++){
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(i,graph,visited,rec,order))return new int[0];
        }
        return order;
    }

    private boolean hasCycle(int i, LinkedList<Integer>[] graph, boolean[] visited, boolean[] rec, int[] order) {
        if (rec[i])return   true;
        if (visited[i])return false;
        visited[i] = true;
        rec[i] = true;
        for (int adj:graph[i]){
            if (hasCycle(adj,graph,visited,rec,order))return true;
        }
        order[orderIndx--]=i;
        rec[i] = false;
        return false;
    }
}
