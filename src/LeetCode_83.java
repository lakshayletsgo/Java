//https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
//In this we have first put the element of array in hash table and make a frequency map and make it so that element occurance is recorded
//Then we use the first value of hash map and get the hcf of it
import java.util.HashMap;
public class LeetCode_83 {
    public static void main(String[] args) {
        int []arr=  {1,2,4,1,2,4};
        System.out.println(hasGroupsSizeX(arr));
    }
    public static int hcf(int x, int y){
        if(y==0) return x;
        return hcf(y,x%y);
    }
    public static boolean hasGroupsSizeX(int[] arr) {
        HashMap<Integer,Integer> hp = new HashMap<>();

        int n = arr.length;
        if(n==1) return false;
        for(int i=0; i<n; i++){
            hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
        }

        int x = hp.get(arr[0]);

        for(var a : hp.values()){
            x = hcf(x,a);
        }

        if(x==1) return false;
        else return true;

    }
}
