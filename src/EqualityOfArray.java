import java.util.*;

public class EqualityOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        System.out.println("Enter the elements of Array 1");
        for (i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of Array 2");
        for (i = 0; i < 5; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.print("Arr1 = ");
        for (i = 0; i < 5; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println("");
        System.out.print("Arr2 = ");
        for (i = 0; i < 5; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println("");
        boolean cond = Arrays.equals(arr1, arr2);
        if (cond == true) {
            System.out.println("Arr1 is equal to Arr2");
        } else {
            System.out.println("Arr1 is not equal to Arr2");
        }
        sc.close();
    }
}
