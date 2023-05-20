import java.util.ArrayList;
import java.util.Collections;

//Some Functions Not Added Earlier
public class Java_49 {
    public static void main(String[] args) {
//        ArrayList
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(104);
        l1.add(103);
        l1.add(102);
        l1.add(101);
        Collections.sort(l1);
//        It will print the list in the ascending order
//        It works on all types of arraylist
        ArrayList<String> al = new ArrayList<>();
        al.add("Lakshay");
        al.add("Mohan");
        al.add("Rahul");
        al.add("Akanshu");
        Collections.sort(al);
        System.out.println(al);



    }
}
