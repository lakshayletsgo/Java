//https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/submissions/1105930095/
//In this I have made so that it first take the sum of the entire travel and the garbage and then take the sum of the charactrer
//And check from, the last whether it is present there or not
public class LeetCode_96 {
    public static void main(String[] args) {
        String []arr = {"MMM","PGM","GP"};
        int[]arr2 = {3,10};
        System.out.println(garbageCollection(arr,arr2));
    }
    public static int garbageCollection(String[] garbage, int[] travel) {
        int sum = 0;
        int n = garbage.length;
        for(int i:travel){
            sum+=i;
        }
        sum = sum*3;
        for(int i=0;i<n;i++){
            sum+=garbage[i].length();
        }
        int j =n-2;

        for(int i=n-1;i>0;i--){
            if(garbage[i].contains("G")){
                break;
            }
            sum-=travel[j];
            j--;
        }
         j =n-2;
        for(int i=n-1;i>0;i--){
            if(garbage[i].contains("P")){
                break;
            }
            sum-=travel[j];
            j--;
        }
        j =n-2;
        for(int i=n-1;i>0;i--){
            if(garbage[i].contains("M")){
                break;
            }
            sum-=travel[j];
            j--;
        }

        return sum;

    }
}
