public class ReLeetCode_171 {
    public static void main(String[] args) {

    }
    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i>=0;i--){
            if (digits[i]+1!=10){
                digits[i] +=1;
                return digits;
            }
            digits[i]=0;
        }
        int []ans=new int[digits.length+1];
        ans[0]=1;
        return ans;
    }
}
