import java.util.*;

public class ReLeetCode_97 {
    public static void main(String[] args) {

    }
    PriorityQueue<Integer> Queue;
    int k;
    public ReLeetCode_97(int k, int[] nums) {
        this.k = k;
        Queue = new PriorityQueue<>(k);

        for (int num:nums){
            if(Queue.size()<k){
                Queue.offer(num);
            } else if (Queue.peek()<num) {
                Queue.offer(num);
                if (Queue.size()>k)Queue.poll();
            }
        }

    }

    public int add(int val) {
        if (Queue.size()<k){
            Queue.offer(val);
        } else if (Queue.peek() < val) {
            Queue.offer(val);
            Queue.poll();
        }


        return Queue.peek();
    }
}
