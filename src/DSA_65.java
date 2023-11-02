//Count Sort using Hash Map
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DSA_65 {
    public static void sortHash(int[]arr){
        if(arr==null||arr.length==1)
        {
            return;
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer,Integer> countMap = new HashMap<>();
        for(int num:arr){
            countMap.put(num,countMap.getOrDefault(num,0)+1);
        }
        int index= 0;
        for(int i=min;i<=max;i++){
            int count = countMap.getOrDefault(i,0);
            for(int j=0;j<count;j++){
                arr[index]=i;
                index++;
            }
        }

    }
    public static void main(String[] args) {
        int[]arr = {4,8,1,5,2,7,2,8};
        sortHash(arr);
        System.out.println(Arrays.toString(arr));
    }

}
