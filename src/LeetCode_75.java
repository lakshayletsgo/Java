//https://leetcode.com/problems/number-of-employees-who-met-the-target/submissions/1098715750/
//It is very easy we just have to return the total values greater than the target
public class LeetCode_75 {
    public static void main(String[] args) {

    }
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c =0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]==target){
                c++;
            }
        }
        return c;
    }
}
