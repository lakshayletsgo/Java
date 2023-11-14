//https://leetcode.com/problems/richest-customer-wealth/submissions/1098719458/
//This is very easy
//In this we maintain a max value and change it when some greater value is met
public class LeetCode_76 {
    public static void main(String[] args) {
        int[][]arr = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int max=0;

        for(int[]a:accounts){
            int sum = 0;
            for(int i=0;i<a.length;i++){
                 sum +=a[i];
            }
            if(sum>max){
                max= sum;
            }
        }

        return max;
    }
}
