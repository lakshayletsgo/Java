//https://leetcode.com/problems/plus-one/description/
//In this i just first checked whether the last element is less than 9 or not
//Then i run a loop where it will iterate till the length of the array in backward direction
//It will break if any element is less than 9
//If it didn't break it means all the elements are 9 so i have created new array where only first index is 1 rest are 0
import java.util.Arrays;

public class LeetCode_22 {
    public static void main(String[] args) {
        int[]arr = {9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1]+=1;
            return digits;}
        int j=digits.length-1;
        while(j>=0){
            if(digits[j]<9){
                digits[j]+=1;
                return digits;
            }else if (digits[j]==9){
                digits[j]=0;
                j--;
            }else{
                j--;
            }
        }
        int [] newAns = new int[digits.length+1];
        newAns[0] = 1;

        return newAns;
    }

}
