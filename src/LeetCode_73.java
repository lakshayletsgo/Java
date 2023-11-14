//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/submissions/1098629143/
public class LeetCode_73 {
    public static void main(String[] args) {
        String[]arr  = {"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(arr));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int c=0;
        for(String ch:operations){
            if(ch.charAt(0)=='+'||ch.charAt(ch.length()-1)=='+'){
                c++;
            } else if (ch.charAt(0)=='-'||ch.charAt(ch.length()-1)=='-') {
                c--;
            }
        }
        return c;
    }
}
