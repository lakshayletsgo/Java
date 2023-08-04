//Find the Missing Element 2
//In this it is same as the previous one in this the range is 1 to n so to check we have to take arr[i]-1
//Then we check which element is misplaced
//Here the length is till the end only the element is wrong
import java.util.ArrayList;
public class DSA_18 {
    public static void main(String[] args) {
        int []arr= {3,1,2,4,6,8,4,2};
        System.out.println(missingElement(arr));
    }
    static ArrayList<Integer> missingElement(int[]arr){
        int i=0;
        while (i<arr.length){
            int correct= arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for( int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                list.add(j+1);
            }
        }
        return list;
    }
    static void swap(int []arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last]  = temp;
    }
}
