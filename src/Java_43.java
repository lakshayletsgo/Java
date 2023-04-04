//Array Deque
//Hash Set
// Yeh LinkedList jaisa hi hai
import java.util.ArrayDeque;
import java.util.HashSet;

public class Java_43 {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        l1.add(56);
        l1.addFirst(23);
        l1.add(35);
        l1.addLast(34);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());


        HashSet<Integer> l2 = new HashSet<>();  // Iski time complexity constant hoti hai
        l2.add(12);
        l2.add(21);
        l2.add(90);
        System.out.println(l2);
    }
}
