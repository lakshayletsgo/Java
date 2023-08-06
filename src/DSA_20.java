import java.lang.reflect.Array;
import java.util.Arrays;

//Duplicate and Missing Index
//Here we have to just return not only the element but also the index also
public class DSA_20 {
    public static void main(String[] args) {
        int []arr = {3,1,5,3,4};
        System.out.println(Arrays.toString(findError(arr)));
     }
    static int[] findError(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return new int[]{arr[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[]arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

}
