import java.util.*;
public class Top150_51 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)->Integer.compare(a[1],b[1]));
        int arrows = 1;
        int prev= points[0][1];
        for(int i=1;i<points.length;++i){
            if(prev<points[i][0]){
                arrows++;
                prev = points[i][1];
            }
        }
        return arrows;

    }
}
