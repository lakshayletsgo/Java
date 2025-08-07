import java.util.*;
public class Top150_93 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int inDeg[] = new int[numCourses];
        for(int i=0;i<numCourses;i++)graph.add(new ArrayList<>());
        for(int[]edge:prerequisites){
            graph.get(edge[1]).add(edge[0]);
            inDeg[edge[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDeg[i]==0)q.add(i);
        }
        int count = 0;
        while(!q.isEmpty()){
            int rem = q.poll();
            count+=1;
            List<Integer> nbor = graph.get(rem);
            for(int v:nbor){
                inDeg[v]--;
                if(inDeg[v]==0)q.add(v);
            }
        }
        return numCourses==count;
    }
}
