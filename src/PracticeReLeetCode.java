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



//    public int evalRPN(String[] tokens) {
//        Stack<Integer> stack = new Stack<>();
//        int operand1,operand2;
//        int result;
//        for(String token:tokens){
//            if(token.equals("+")){
//                operand1 = stack.pop();
//                operand2= stack.pop();
//                stack.push( operand2+operand1);
//            }else if(token.equals("-")){
//                operand1 = stack.pop();
//                operand2= stack.pop();
//                stack.push( operand2-operand1);
//            }else if(token.equals("/")){
//                operand1 = stack.pop();
//                operand2= stack.pop();
//                stack.push( operand2/operand1);
//            }else if(token.equals("*")){
//                operand1 = stack.pop();
//                operand2= stack.pop();
//                stack.push( operand2*operand1);
//            }else{
//                stack.push(Integer.parseInt(token));
//            }
//        }
//        return stack.peek();
//
//    }






//    public void helper(List<String> ans, String s, int n, int left, int right){
//        if(s.length()==n*2){
//            ans.add(s);
//            return;
//        }
//        if(left<n)helper(ans,s+"(",n,left+1,right);
//        if(right<left)helper(ans,s+")",n,left,right+1);
//    }


//
//    public int[] dailyTemperatures(int[] temperatures) {
//        int []ans = new int[temperatures.length];
//        Arrays.fill(ans,0);
//        Stack<Map.Entry<Integer,Integer>> stack = new Stack<>();
//        for(int i=0;i<temperatures.length;i++){
//            while(!stack.isEmpty()&&(stack.peek().getKey()<temperatures[i])){
//                Map.Entry<Integer,Integer> temp = stack.pop();
//                ans[temp.getValue()] = i-temp.getKey();
//            }
//            stack.push(Map.entry(temperatures[i],i));
//        }
//        return ans;
//    }






//    public int carFleet(int target, int[] position, int[] speed) {
//        int n =position.length;
//        if(n==1)return 1;
//        int[][] posAndSpeed= new int[n][2];
//        Stack<Double> stack = new Stack<>();
//        for(int i=0;i<n;i++){
//            posAndSpeed[i][0]=position[i];
//            posAndSpeed[i][1]=speed[i];
//        }
//        Arrays.sort(posAndSpeed,Comparator.comparingInt(o->o[0]));
//        for(int i=n-1;i>=0;i--){
//            double currTime = (double) (target-posAndSpeed[i][0])/posAndSpeed[i][1];
//            if(!stack.isEmpty()&&currTime<=stack.peek())  continue;
//            else stack.push(currTime);
//        }
//        return stack.size();
//    }


//    public int largestRectangleArea(int[] heights) {
//        Stack<Map.Entry<Integer,Integer>> stack = new Stack<>();
//        int n= heights.length;
//        int maxArea=0;
//        for(int i=0;i<=n;i++){
//            int start= i;
//            while((!stack.isEmpty())&&(i==n||stack.peek().getValue()>heights[i])){
//                Map.Entry<Integer,Integer> temp=stack.pop();
//                int length= i-temp.getKey();
//                maxArea= Math.max(maxArea,temp.getValue()*length);
//                start=temp.getKey();
//            }
//            if(i<n)stack.push(Map.entry(start,heights[i]));
//        }
//        return maxArea;
//    }

//    public int search(int[] nums, int target) {
//        if(nums.length==1)return nums[0]==target?0:-1;
//        int s=0;
//        int e=nums.length;
//        while(s<e){
//            int mid=(s+e)/2;
//            if(target==nums[mid])return mid;
//            else if(target>nums[mid]) s=mid+1;
//            else e=mid;
//
//        }
//        return -1;
//    }


//    public boolean searchMatrix(int[][] matrix, int target) {
//        int r= 0;
//        int c=matrix[0].length-1;
//        while(c>=0&&r<matrix.length){
//            if(matrix[r][c]==target)return true;
//            else if(matrix[r][c]<target)r++;
//            else c--;
//        }
//        return false;
//    }



//    public int minEatingSpeed(int[] piles, int h) {
//        int max= 0;
//        for(int pile:piles)max=Math.max(max,pile);
//        return binarySearch(max,piles,h,1);
//    }
//    private int binarySearch(int right, int[]piles,int target,int left ){
//        while(left<=right){
//            int mid=left+(right-left)/2;
//            if(computeData(piles,mid)<=target)right=mid-1;
//            else left=mid+1;
//        }
//        return left;
//    }
//    private long computeData(int[]piles,int mid){
//        long res=0;
//        for(int pile:piles)res+=(mid+pile-1)/mid;
//        return res;
//    }




//    public int findMin(int[] nums) {
//        int left=0;
//        int right=nums.length-1;
//        while(left<right){
//            int mid=(left+right)/2;
//            if(nums[mid]>nums[right])left=mid+1;
//            else right=mid;
//        }
//        return nums[left];
//    }


//    public int search(int[] nums, int target) {
//        int s=0;
//        int e=nums.length-1;
//        while(s<=e){
//            int mid=s+(e-s)/2;
//            if(nums[mid]==target)return mid;
//            if(nums[s]<=nums[mid]){
//                if(nums[s]<=target&&target<nums[mid]){
//                    e=mid-1;
//                }else s=mid+1;
//            }else{
//                if(nums[mid]<target&&target<=nums[e])s=mid+1;
//                else e=mid-1;
//            }
//        }
//        return -1;
//    }



//    private class Data{
//        String str;
//        int time;
//        Data(String str, int time){
//            this.str=str;
//            this.time=time;
//        }
//    }
//    HashMap <String,List<Data>>map;
//
//    public TimeMap() {
//        map=new HashMap<>();
//    }
//
//    public void set(String key, String value, int timestamp) {
//        map.computeIfAbsent(key,k->new ArrayList<>()).add(new Data(value,timestamp));
//    }
//
//    public String get(String key, int timestamp) {
//        if(!map.containsKey(key))return "";
//        return binarySearch(map.get(key),timestamp);
//    }
//    private String binarySearch(List<Data> list,int timestamp){
//        int l=0,r=list.size()-1;
//        while(l<r){
//            int mid=(l+r+1)>>>1;
//            if(list.get(mid).time>timestamp)r=mid-1;
//            else l=mid;
//        }
//        return list.get(l).time<=timestamp?list.get(l).str:"";
//    }




//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//        if(nums1.length>nums2.length){
//            int []temp=nums1;
//            nums1=nums2;
//            nums2=temp;
//        }
//        int n =nums1.length;
//        int m =nums2.length;
//        int left = 0;
//        int right=n;
//        while(left<=right){
//            int part1=(left+right)/2;
//            int part2=(n+m+1)/2-part1;
//            int maxLeft1=part1>0?nums1[part1-1]:Integer.MIN_VALUE;
//            int maxLeft2=part2>0?nums2[part2-1]:Integer.MIN_VALUE;
//            int maxLeft=Math.max(maxLeft1,maxLeft2);
//
//            int maxRight1= part1<n?nums1[part1]:Integer.MAX_VALUE;
//            int maxRight2= part2<m?nums2[part2]:Integer.MAX_VALUE;
//            int maxRight=Math.min(maxRight1,maxRight2);
//
//            if(maxLeft<=maxRight){
//                if((n+m)%2==0)return (maxLeft+maxRight)/2.0;
//                else return maxLeft;
//            }else if(maxLeft1>maxRight2)right=part1-1;
//            else left= part1+1;
//        }
//        return 0.0;
//
//    }



//    public int maxProfit(int[] prices) {
//        int minBuy = prices[0];
//        int maxProfit = 0;
//        for (int i : prices) {
//            minBuy = Math.min(minBuy, i);
//            maxProfit = Math.max(maxProfit, i - minBuy);
//        }
//        return maxProfit;
//    }




//    public int lengthOfLongestSubstring(String s) {
//        Set<Character> set= new HashSet<>();
//        int maxLen=0;
//        int left=0;
//        for(int right=0;right<s.length();right++){
//            if(!set.contains(s.charAt(right))){
//                set.add(s.charAt(right));
//                maxLen=Math.max(maxLen,right-left+1);
//            }else{
//                while(set.contains(s.charAt(right))){
//                    set.remove(s.charAt(left));
//                    left++;
//                }
//                set.add(s.charAt(right));
//            }
//        }
//        return maxLen;
//    }



    public int characterReplacement(String s, int k) {
        int []arr=new int[26];
        int l=0,max=0,res=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
            max=Math.max(max,arr[s.charAt(i)-'A']);
            if(i-l+1-max>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            res=Math.max(res,i-l+1);
        }
        return res;

    }
    }
