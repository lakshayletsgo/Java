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


//    public int trap(int[] height) {
//        int start= 0;
//        int end= height.length-1;
//        int leftMax=height[start];
//        int rightMax=height[end];
//        int ans=0;
//        while(start<end){
//            if(leftMax<rightMax){
//                start++;
//                leftMax=Math.max(leftMax,height[start]);
//                ans+=leftMax-height[start];
//            }else{
//                end--;
//                rightMax=Math.max(rightMax,height[end]);
//                ans+=rightMax-height[end];
//            }
//        }
//        return ans;
//    }

//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')stack.push(s.charAt(i));
//            else {
//                if(stack.isEmpty())return false;
//                char top=stack.peek();
//                if((s.charAt(i)==')'&&top=='(')||(s.charAt(i)=='}'&&top=='{')||(s.charAt(i)==']'&&top=='['))stack.pop();
//                else return false;
//            }
//        }
//        return stack.isEmpty();
//    }
//class MinStack {
//
//    int min = Integer.MAX_VALUE;
//    Stack<Integer> stack = new Stack<>();
//
//    public void push(int val) {
//        if(val<=min){
//            stack.push(min);
//            min= val;
//        }
//        stack.push(val);
//    }
//
//    public void pop() {
//        if(stack.pop()==min)min=stack.pop();
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int getMin() {
//        return min;
//    }
//}



    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int operand1,operand2;
        int result;
        for(String token:tokens){
            if(token.equals("+")){
                operand1 = stack.pop();
                operand2= stack.pop();
                stack.push( operand2+operand1);
            }else if(token.equals("-")){
                operand1 = stack.pop();
                operand2= stack.pop();
                stack.push( operand2-operand1);
            }else if(token.equals("/")){
                operand1 = stack.pop();
                operand2= stack.pop();
                stack.push( operand2/operand1);
            }else if(token.equals("*")){
                operand1 = stack.pop();
                operand2= stack.pop();
                stack.push( operand2*operand1);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();

    }

}
