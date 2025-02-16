import java.util.Comparator;
import java.util.PriorityQueue;

public class ReLeetCode_98 {
    public static void main(String[] args) {

    }
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(30, Comparator.reverseOrder());
        for (int stone:stones){
            queue.offer(stone);
        }
        while (queue.size()>=2){
            int x = queue.poll();
            int y = queue.poll();
            if (x>y){
                queue.offer(x-y);
            }
        }
        return queue.size()==1?queue.peek():0;
    }
}
