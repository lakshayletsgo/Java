import java.util.*;

public class ReLeetCode_145 {
    public static void main(String[] args) {

    }
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> hashMap = new HashMap<>();
        Queue<int[]>queue = new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<=n;i++)hashMap.put(i,new ArrayList<>());
        for (int []time:times)hashMap.get(time[0]).add(new int[]{time[1],time[2]});
        queue.add(new int[]{k,0});
        while (!queue.isEmpty()){
            int []curr = queue.poll();
            int node = curr[0], time=curr[1];
            if (map.containsKey(node))continue;
            map.put(node,time);
            for (int []nei:hashMap.get(node)){
                int nextNode = nei[0],nextTime=nei[1];
                if (!map.containsKey(nextNode))queue.offer(new int[]{nextNode, time+nextTime});
            }
        }
        if (map.size()!=n)return -1;
        return Collections.max(map.values());
    }
}
