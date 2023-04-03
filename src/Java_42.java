import java.util.LinkedList;

//Linked List
//LinkedList aur ArrayList have same methods and same intialisation
public class Java_42 {
    public static void main(String[] args) {
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(12);
        l2.clear();
        l2.add(23);
        l2.add(231);
        l2.add(232);

//        Yeh method bas linkedlist me hota hai
//        ArrayList me nahi hota
        l2.addLast(23);
        l2.addFirst(2);

        System.out.println(l2.size());
    }
}
