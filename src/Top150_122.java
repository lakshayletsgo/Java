import java.util.*;
public class Top150_122 {
    private class Project{
        int capital, profit;
        public Project(int c, int p){this.capital =c;
            this.profit = p;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        List<Project> projects = new ArrayList<>();
        for(int i=0;i<n;i++)projects.add(new Project(capital[i],profits[i]));
        Collections.sort(projects,(a,b)->a.capital-b.capital);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x,y)->y-x);
        int i=0;
        for(int j=0;j<k;j++){
            while(i<n&&projects.get(i).capital<=w){
                maxHeap.add(projects.get(i).profit);
                i++;
            }
            if(maxHeap.isEmpty())break;
            w+=maxHeap.poll();
        }
        return w;
    }
}
