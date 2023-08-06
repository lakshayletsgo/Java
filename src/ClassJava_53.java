import java.util.LinkedList;
import java.util.Scanner;

public class ClassJava_53 {
    public static void main(String[] args) {
        LinkedList <Integer> l1 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("First enter some elements: ");
        l1.add(sc.nextInt());
        l1.add(sc.nextInt());
        l1.add(sc.nextInt());
        l1.add(sc.nextInt());

        System.out.println("Enter the element for first Index: ");
        l1.add(0,sc.nextInt());
        System.out.println("Enter the element for last Index : ");
        l1.add(l1.size(), sc.nextInt());
        System.out.println("Enter the specific location : ");
        int n = sc.nextInt();
        l1.add(n,sc.nextInt());
        System.out.println(l1);

//        Delete the first element
        l1.remove(0);
//        Delete the last element
        l1.remove(l1.size()-1);
        System.out.println("Enter the specific location: ");
        l1.remove(sc.nextInt());
        System.out.println(l1);
    }

}
