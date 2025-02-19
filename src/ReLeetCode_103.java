import java.util.*;

public class ReLeetCode_103 {
    public static void main(String[] args) {

    }
    private boolean even = true;
    private PriorityQueue<Integer> small  = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> large  = new PriorityQueue<>();
    public ReLeetCode_103() {

    }

    public void addNum(int num) {
        if (!even){
            small.add(num);
            large.add(small.poll());
        }else{
            large.add(num);
            small.add(large.poll());
        }
    }

    public double findMedian() {
        if (even) {
            return (small.peek()+large.peek())/2.0;
        }
        return small.peek();
    }
}
