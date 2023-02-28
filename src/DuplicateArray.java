import java.util.*;

public class DuplicateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int arr1[] = new int[5];
        int i;
        int j = 0;
        System.out.println("Enter 5 numbers for array");
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < 5; i++) {
            if (arr[i] > 100 || arr[i] < 5) {
                System.out.println("Please re-enter the value");
                return;
            }
        }
        for (i = 0; i < 5; i++) {
            arr1[j] = arr[i];
            j++;
        }
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] == arr[j]) {
                    arr[i] = 2;
                }
            }
        }
        System.out.println("New Array :");
        for (i = 0; i < 5; i++) {
            if (arr[i] == 2) {
                continue;
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}
