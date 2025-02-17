import java.util.PriorityQueue;

public class ReLeetCode_100 {
    public static void main(String[] args) {

    }
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for (int n:nums){
            if (minHeap.size()<k)minHeap.add(n);
            if (minHeap.peek()<=n){
                minHeap.add(n);
                if (minHeap.size()<k)minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
