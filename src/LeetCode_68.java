//https://leetcode.com/problems/container-with-most-water/submissions/1095067721/
//In this we use greedy Algorithm
//Greedy Algorithm is one in which we take the max of two and then update the solution
public class LeetCode_68 {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}
