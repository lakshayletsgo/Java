//https://leetcode.com/problems/truncate-sentence/submissions/1103609438/

public class LeetCode_92 {
    public static void main(String[] args) {
        System.out.println(truncateSentence("What is the solution to this problem",4));
    }
    public static String truncateSentence(String s, int k) {
        String[]arr = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i=0;i<k-1;i++){
            str.append(arr[i]+" ");
        }
        str.append(arr[k-1]);
        return str.toString();

    }
}
