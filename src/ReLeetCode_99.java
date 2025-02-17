import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ReLeetCode_99 {
    public static void main(String[] args) {

    }
    private static class  Points{
        int x;
        int y;
        double dist;
        public Points(int x,int y){
            this.x =x;
            this.y =y;
            this.dist = Math.sqrt(x*x+y*y);
        }
    }
    private static class PointComparator implements Comparator<Points> {

        @Override
        public int compare(Points p1,Points p2) {
            if (p1.dist<p2.dist){
                return 1;
            } else if (p2.dist < p1.dist) {
                return -1;
            }else{
                return 0;
            }

        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Points> pq = new PriorityQueue<>(new PointComparator());
        int[][]ansPt = new int[k][2];
        for (int i = 0; i < points.length; i++) {
            pq.add(new Points(points[i][0],points[i][1]));
            if (pq.size()>k)pq.poll();
        }
        for (int i=0;i<k;i++){
            Points p =  pq.poll();
            ansPt[i][0] = p.x;
            ansPt[i][1] = p.y;
        }
        return ansPt;
    }
}
