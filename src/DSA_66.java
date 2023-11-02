//Radix Sort
//It is used for more than 1 digit number we use the count sort here only
//We apply count sort to each place of the every digit
//We apply count sort for the number of digits of the heighest number of the array
import java.util.Arrays;
public class DSA_66 {
    public static void main(String[] args) {
        int []arr={54,6,1,423,121,6853};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void radixSort(int[]arr){
        int max = Arrays.stream(arr).max().getAsInt();
        for(int exp=1;max/exp>0;exp*=10){
            countSort(arr,exp);
        }
    }
    private static void countSort(int[]arr, int exp){
        int n=arr.length;
        int[]output = new int[n];
        int[]count = new int[10];
        Arrays.fill(count,0);

        for(int i=0;i<n;i++) {
            count[(arr[i] / exp) % 10]++;
        }
        System.out.println("Count Array for "+exp+" : "+Arrays.toString(count));
        for(int j=1;j<10;j++){
            count[j] = count[j]+count[j-1];
        }
        System.out.println("Updated count Array : "+Arrays.toString(count));
        for(int i=n-1;i>=0;i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        System.arraycopy(output,0,arr,0,n);
    }
}
