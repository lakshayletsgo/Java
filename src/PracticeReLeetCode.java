import java.util.*;

public class PracticeReLeetCode {



//    public boolean isValidSudoku(char[][] board) {
//        int row= board.length;
//        int col=board.length;
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                if(board[i][j]!='.'&&(!isValidHor(board,i,j)||!isValidVer(board,i,j)||!isValidBox(board,i,j)))return false;
//            }
//        }
//        return true;
//    }
//    private boolean isValidHor(char[][]board,int posRow,int posCol){
//        for(int i=0;i<board.length&&i!=posCol;i++){
//            if(board[posRow][i]==board[posRow][posCol])return false;
//        }
//        return true;
//    }
//    private boolean isValidVer(char[][]board,int posRow,int posCol){
//        for(int i=0;i<board.length&&i!=posRow;i++)if(board[i][posCol]==board[posRow][posCol])return false;
//        return true;
//    }
//    private boolean isValidBox(char[][]board,int posRow,int posCol){
//        int i=posRow-posRow%3;
//        int j=posCol-posCol%3;
//        for(int i1=i;i1<i+3;i1++){
//            for(int j1=j;j1<j+3;j1++){
//                if(i1==posRow) if(j1==posCol)continue;
//                if(board[i1][j1]==board[posRow][posCol])return false;
//            }
//        }
//        return true;
//    }



//    public boolean isPalindrome(String s) {
//        int start=0;
//        int end=s.length()-1;
//        while(start<=end){
//            if(!Character.isLetterOrDigit(s.charAt(start))||!Character.isSpaceChar(' '))start++;
//            else if(!Character.isLetterOrDigit(s.charAt(end))||!Character.isSpaceChar(' '))end--;
//            else if(Character.toLowerCase(s.charAt(start))==Character.toLowerCase(s.charAt(end))){
//                start++;
//                end--;
//            }else return false;
//        }
//        return true;
//    }



//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> map= new HashMap<>();
//        for(int i=0;i<nums.length;i++)map.put(nums[i],i);
//        for(int i=0;i<nums.length;i++)if(map.containsKey(target-nums[i])&&map.get(target-nums[i])!=i)return new int[]{i,map.get(target-nums[i])};
//        return new int[]{-1,-1};
//    }



//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ans= new ArrayList<>();
//        Arrays.sort(nums);
//        Map<Integer,Integer> map =new HashMap<>();
//        for(int i=0;i<nums.length;i++)map.put(nums[i],i);
//        for(int i=0;i<nums.length;i++){
//            if(i>0&&nums[i]==nums[i-1])continue;
//            int newTarget=-nums[i];
//            int start=i+1;
//            int end = nums.length-1;
//            while(start<end&&start!=i&&end!=i){
//                if(nums[start]+nums[end]==newTarget){
//                    ans.add(Arrays.asList(nums[i],nums[start],nums[end]));
//                    start++;
//                    while(nums[start]==nums[start-1]&&start<end)start++;
//                }else if(nums[start]+nums[end]<newTarget)start++;
//                else end--;
//            }
//        }
//        return ans;}


//    public int maxArea(int[] height) {
//        int s=0;
//        int max=0;
//        int e=height.length-1;
//        while(s<e){
//            max=Math.max(Math.min(height[s],height[e])*(e-s),max);
//            if(height[s]>height[e])e--;
//            else s++;
//        }
//        return max;
//    }


    public int trap(int[] height) {
        int start= 0;
        int end= height.length-1;
        int leftMax=height[start];
        int rightMax=height[end];
        int ans=0;
        while(start<end){
            if(leftMax<rightMax){
                start++;
                leftMax=Math.max(leftMax,height[start]);
                ans+=leftMax-height[start];
            }else{
                end--;
                rightMax=Math.max(rightMax,height[end]);
                ans+=rightMax-height[end];
            }
        }
        return ans;
    }

}
