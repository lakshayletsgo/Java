import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PracticeReLeetCode {
    PriorityQueue<Integer> smallHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> largeHeap = new PriorityQueue<>();
    private boolean even = true;


    public void addNum(int num) {
        if (!even){
            smallHeap.offer(num);
            largeHeap.offer(smallHeap.poll());
        }else{
            largeHeap.offer(num);
            smallHeap.offer(largeHeap.poll());
        }
        even = !even;
    }

    public double findMedian() {
        if (even){
            return (smallHeap.peek()+largeHeap.peek())/2.0;
        }else{
            return smallHeap.peek();
        }
    }
}
