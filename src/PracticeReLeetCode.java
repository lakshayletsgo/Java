import java.util.*;

public class PracticeReLeetCode {

//    public int maxDepth(TreeNode root) {
//        if(root==null)return 0;
//        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
//    }

//    private int diameter = 0; // To store the maximum diameter
//
//    public int diameterOfBinaryTree(TreeNode root) {
//        calculateDepth(root);
//        return diameter;
//    }
//
//    private int calculateDepth(TreeNode node) {
//        if (node == null) {
//            return 0; // Base case: depth of an empty tree is 0
//        }
//
//        // Recursively find the depth of the left and right subtrees
//        int leftDepth = calculateDepth(node.left);
//        int rightDepth = calculateDepth(node.right);
//
//        // Update the diameter at the current node
//        diameter = Math.max(diameter, leftDepth + rightDepth);
//
//        // Return the depth of the current subtree
//        return 1 + Math.max(leftDepth, rightDepth);
//    }




//    public int getHeight(TreeNode root){
//        if (root==null)return 0;
//        int left = getHeight(root.left);
//        int right = getHeight(root.right);
//        return left==-1||right==-1||(Math.abs(left-right)>1)?-1:1+Math.max(left,right);
//    }
//
//    public boolean isBalanced(TreeNode root) {
//        if (root==null) return true;
//        if (getHeight(root)==-1)return false;
//        return true;
//    }



//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if (p==null||q==null){
//            return p==q;
//        }
//        return p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
//    }

//    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//        if (root == null) {
//            return false;
//        }
//        if (root.val==subRoot.val&&sameTree(root,subRoot)){
//            return true;
//        }
//        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
//    }
//    private boolean sameTree(TreeNode root,TreeNode subRoot){
//        if (root==null&&subRoot==null){
//            return true;
//        }
//        if (root==null||subRoot==null||root.val!=subRoot.val){
//            return false;
//        }
//        return sameTree(root.left,subRoot.left)&&sameTree(root.right,subRoot.right);
//    }


//    public int minDepth(TreeNode root) {
//        if (root==null) return 0;
//        int left = minDepth(root.left);
//        int right = minDepth(root.right);
//        return (left==0||right==0)?left+right+1:1+(Math.min(left,right));
//    }

//    TreeNode prev;
//    int diff = Integer.MAX_VALUE;
//    public int getMinimumDifference(TreeNode root) {
//        dfs(root);
//        return diff;
//    }
//    public void dfs(TreeNode root){
//        if(root==null)return ;
//        dfs(root.left);
//        if(prev!=null)diff = Math.min(diff,root.val-prev.val);
//        prev = root;
//        dfs(root.right);
//    }



//    int topNodeVal;
//    public boolean isUnivalTree(TreeNode root) {
//        topNodeVal= root.val;
//        return helper(root);
//    }
//    private boolean helper(TreeNode root){
//        if(root==null)return true;
//        return root.val==topNodeVal&&helper(root.left)&&helper(root.right);
//    }


//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root==null||root==p||root==q)return root;
//        TreeNode left= lowestCommonAncestor(root.left,p,q);
//        TreeNode right= lowestCommonAncestor(root.right,p,q);
//        if(left!=null&&right!=null)return root;
//        return left==null?right:left;
//    }

//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> ans = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//        if(root==null)return ans;
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            int levelSize = queue.size();
//            List<Integer> level = new ArrayList<>();
//            for(int i=0;i<levelSize;i++){
//                TreeNode curr = queue.poll();
//                level.add(curr.val);
//                if(curr.left!=null) queue.add(curr.left);
//                if(curr.right!=null)queue.add(curr.right);
//            }
//            ans.add(level);
//        }
//        return ans;
//    }



//    public List<Integer> rightSideView(TreeNode root) {
//
//        List<Integer> ans = new ArrayList<>();
//        Queue<TreeNode> queue  = new LinkedList<>();
//        if(root==null)return ans;
//        queue.add(root);
//        while(!queue.isEmpty()){
//            int levelSize = queue.size();
//            List<Integer> level = new ArrayList<>();
//            for(int i=0;i<levelSize;i++){
//                TreeNode curr = queue.poll();
//                level.add(curr.val);
//                if(curr.left!=null)queue.add(curr.left);
//                if(curr.right!=null)queue.add(curr.right);
//            }
//            ans.add(level.getLast());
//        }
//        return ans;
//    }




//    public int goodNodes(TreeNode root) {
//        return root==null?0:helper(root,root.val);
//    }
//    public int helper(TreeNode root, int temp){
//        if(root==null)return 0;
//        temp = Math.max(root.val,temp);
//        return root.val>=temp?1+helper(root.left,temp)+helper(root.right,temp):helper(root.left,temp)+helper(root.right,temp);
//    }



//    public boolean isValidBST(TreeNode root) {
//        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
//    }
//
//    private boolean helper(TreeNode root,long min, long max){
//        if(root==null)return true;
//        if(root.val<=min||root.val>=max)return false;
//        return helper(root.right,root.val,max)&&helper(root.left,min,root.val);
//    }


//    public int peakIndexInMountainArray(int[] arr) {
//        int start =0;
//        int end = arr.length-1;
//        while(start<end){
//            int mid = start+(end-start)/2;
//            if(arr[mid]>arr[mid+1]){
//                end =mid;
//            }else{
//                start = mid+1;
//            }
//        }
//        return start;
//    }




    int index = 0;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root, k);
        return index;
    }
    public void helper(TreeNode root, int k){
        if(root.left!=null)helper(root.left,k);
        count--;
        if(count==0){
            index = root.val;
            return;
        }
        if(root.right!=null)helper(root.right,k);
    }




}


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



//    public int characterReplacement(String s, int k) {
//        int []arr=new int[26];
//        int l=0,max=0,res=0;
//        for(int i=0;i<s.length();i++){
//            arr[s.charAt(i)-'A']++;
//            max=Math.max(max,arr[s.charAt(i)-'A']);
//            if(i-l+1-max>k){
//                arr[s.charAt(l)-'A']--;
//                l++;
//            }
//            res=Math.max(res,i-l+1);
//        }
//        return res;
//
//    }


//    public boolean checkInclusion(String s1, String s2) {
//        int[]arr= new int[26];
//        int s=0,e=0;
//        for(int i=0;i<s1.length();i++)arr[s1.charAt(i)-'a']++;
//        while(e<s2.length()){
//            arr[s2.charAt(e)-'a']--;
//            while(arr[s2.charAt(e)-'a']<0){
//                arr[s2.charAt(s)-'a']++;
//                s++;
//            }
//            boolean flag=true;
//            for(int i=0;i<26;i++){
//                if(arr[i]!=0){
//                    flag=false;
//                    break;
//                }
//            }
//            if(flag&&e-s+1==s1.length())return true;
//            e++;
//        }
//        return false;

//    }


//    public String minWindow(String s, String t) {
//        if (s.length() < t.length()) {
//            return "";
//        }
//
//        Map<Character, Integer> charCount = new HashMap<>();
//        for (char ch : t.toCharArray()) {
//            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
//        }
//
//        int targetCharsRemaining = t.length();
//        int[] minWindow = {0, Integer.MAX_VALUE};
//        int startIndex = 0;
//
//        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
//            char ch = s.charAt(endIndex);
//            if (charCount.containsKey(ch) && charCount.get(ch) > 0) {
//                targetCharsRemaining--;
//            }
//            charCount.put(ch, charCount.getOrDefault(ch, 0) - 1);
//
//            if (targetCharsRemaining == 0) {
//                while (true) {
//                    char charAtStart = s.charAt(startIndex);
//                    if (charCount.containsKey(charAtStart) && charCount.get(charAtStart) == 0) {
//                        break;
//                    }
//                    charCount.put(charAtStart, charCount.getOrDefault(charAtStart, 0) + 1);
//                    startIndex++;
//                }
//
//                if (endIndex - startIndex < minWindow[1] - minWindow[0]) {
//                    minWindow[0] = startIndex;
//                    minWindow[1] = endIndex;
//                }
//
//                charCount.put(s.charAt(startIndex), charCount.getOrDefault(s.charAt(startIndex), 0) + 1);
//                targetCharsRemaining++;
//                startIndex++;
//            }
//        }
//
//        return minWindow[1] >= s.length() ? "" : s.substring(minWindow[0], minWindow[1] + 1);
//    }



//
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        List<Integer> ans = new ArrayList<>();
//        Deque<Integer> deq=new LinkedList<>();
//        for(int i=0;i<nums.length;i++){
//            int num=nums[i];
//            while(!deq.isEmpty()&&deq.getLast()<num)deq.pollLast();
//            deq.addLast(num);
//            if(i>=k&&nums[i-k]==deq.getFirst())deq.pollFirst();
//            if(i>=k-1){ans.add(deq.getFirst());
//            }
//        }
//        return ans.stream().mapToInt(i->i).toArray();}

//    public ListNode reverseList(ListNode head) {
//        if(head==null||head.next==null)return head;
//        ListNode next= null;
//        ListNode prev= null;
//        while(head!=null){
//            next = head.next;
//            head.next= prev;
//            prev= head;
//            head= next;
//        }
//        return prev;
//    }


//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if (list2==null){
//            return list1;
//        } else if (list1==null) {
//            return list2;
//        }
//        ListNode p1 = list1;
//        ListNode p2 = list2;
//        ListNode p3 = null;
//        if (p1.val>p2.val){
//            p3= p2;
//            p2 = p2.next;
//        }else{
//            p3 = p1;
//            p1 = p1.next;
//        }
//        ListNode newHead = p3;
//        while (p1!=null&&p2!=null){
//            if (p1.val>p2.val){
//                p3.next= p2;
//                p2 = p2.next;
//            }else{
//                p3.next = p1;
//                p1 = p1.next;
//            }
//            p3 = p3.next;
//        }
//
//        if (p1!=null){
//            while (p1!=null){
//                p3.next = p1;
//                p1 = p1.next;
//                p3 = p3.next;
//            }
//        }else{
//            while (p2!=null){
//                p3.next = p2;
//                p2 = p2.next;
//                p3 = p3.next;
//            }
//        }
//        return newHead;
//    }





//    public void reorderList(ListNode head) {
//        if(head==null||head.next==null)return;
//        ListNode mid = getMid(head);
//        ListNode midHead= reverseMid(mid);
//        mergeMid(head,midHead);
//    }
//    public ListNode getMid(ListNode head){
//        ListNode fast=head;
//        ListNode slow = head;
//        ListNode prev= slow;
//        while(fast!=null&&fast.next!=null){
//            prev= slow;
//            slow =slow.next;
//            fast= fast.next.next;
//        }
//        prev.next= null;
//        return slow;
//    }
//    public ListNode reverseMid(ListNode head){
//        ListNode prev= null;
//        ListNode next= null;
//        while(head!=null){
//            next= head.next;
//            head.next= prev;
//            prev= head;
//            head= next;
//        }
//        return prev;
//    }
//    public void mergeMid(ListNode list1, ListNode list2){
//        while(list2!=null){
//            ListNode next= list1.next;
//            list1.next= list2;
//            list1= list2;
//            list2= next;
//        }
//    }




//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode temp =head;
//        ListNode temp2 =head;
//        ListNode prev=null;
//        for(int i=1;i<=n;i++)temp=temp.next;
//        if(temp==null)return head.next;
//        while(temp!=null){
//            prev= temp2;
//            temp = temp.next;
//            temp2= temp2.next;
//        }
//        prev.next= temp2.next;
//        return head;
//    }



//    public Node copyRandomList(Node head) {
//        HashMap<Node,Node> map = new HashMap<>();
//        if(head==null)return null;
//        Node curr= head;
//        while(curr!=null){
//            map.put(curr,new Node(curr.val));
//            curr= curr.next;
//        }
//        curr= head;
//        while(curr!=null){
//            Node copied = map.get(curr);
//            copied.next= map.get(curr.next);
//            copied.random = map.get(curr.random);
//            curr= curr.next;
//        }
//        return map.get(head);
//    }




//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        return helper(l1,l2,0);
//    }
//    public ListNode helper(ListNode l1, ListNode l2, int carry){
//        if(l1==null&&l2==null&&carry==0)return null;
//        int val1 = l1==null?0:l1.val;
//        int val2 = l2==null?0:l2.val;
//        int sum  = val1+val2+carry;
//        carry=sum/10;
//        ListNode node = new ListNode(sum%10);
//        node.next= helper(l1==null?null:l1.next,l2==null?null:l2.next,carry);
//        return node;
//    }


//    public boolean hasCycle(ListNode head) {
//        if(head==null||head.next==null)return false;
//        ListNode fast= head;
//        ListNode slow = head;
//        while(fast!=null&&fast.next!=null){
//            fast= fast.next.next;
//            slow = slow.next;
//            if(fast==slow)return true;
//        }
//        return false;
//    }


//    public int findDuplicate(int[] nums) {
//        int fast = nums[0];
//        int slow =  nums[0];
//        do{
//            fast= nums[nums[fast]];
//            slow = nums[slow];
//        }while(slow!=fast);
//        fast=nums[0];
//        while(fast!=slow){
//            fast= nums[fast];
//            slow= nums[slow];
//        }
//        return fast;

//    }


//class LRUCache {
//
//    private class Node{
//        Node prev, next;
//        int key, val;
//        Node(int key, int val){
//            this.key = key;
//            this.val= val;
//        }
//    }
//    int capacity;
//    Node head= new Node(0,0),tail = new Node(0,0);
//    Map<Integer,Node> map = new HashMap<>();
//    public LRUCache(int capacity) {
//        this.capacity=capacity;
//        head.next= tail;
//        tail.prev= head;
//    }
//
//    public int get(int key) {
//        if(map.containsKey(key)){
//            Node data= map.get(key);
//            remove(data);
//            insert(data);
//            return data.val;
//        }
//        return -1;
//    }
//
//    public void put(int key, int value) {
//        if(map.containsKey(key))remove(map.get(key));
//        if(map.size()==capacity)remove(tail.prev);
//        insert(new Node(key,value));
//    }
//    void insert(Node node){
//        map.put(node.key,node);
//        Node headNext = head.next;
//        head.next = node;
//        node.prev = head;
//        headNext.prev= node;
//        node.next = headNext;
//    }
//    void remove(Node node){
//        map.remove(node.key);
//        node.prev.next = node.next;
//        node.next.prev = node.prev;
//    }

//
//    public ListNode mergeKLists(ListNode[] lists) {
//    if(lists.length==0||lists==null)return null;
//    return helper(lists,0,lists.length-1);
//}
//private ListNode helper(ListNode[]lists,int start, int end){
//    if(start==end)return lists[start];
//    if(start+1==end)return merge(lists[start],lists[end]);
//    int mid = start+(end-start)/2;
//    ListNode leftList = helper(lists,start,mid);
//    ListNode rightList = helper(lists,mid+1,end);
//    return merge(leftList,rightList);
//}
//private ListNode merge(ListNode leftList, ListNode rightList){
//    ListNode temp = new ListNode(0);
//    ListNode curr = temp;
//    while(leftList!=null&&rightList!=null){
//        if(leftList.val<rightList.val){
//            curr.next = leftList;
//            leftList = leftList.next;
//        }else{
//            curr.next = rightList;
//            rightList = rightList.next;
//        }
//        curr= curr.next;
//    }
//    curr.next = leftList==null?rightList:leftList;
//    return temp.next;
//}


//int length =0;
//boolean flag = true;
//public ListNode reverseKGroup(ListNode head, int k) {
//    if(flag){
//        flag = false;
//        ListNode p = head;
//        length = getLength(head);
//    }
//    int temp = k;
//    ListNode curr = head;
//    ListNode prev = null;
//    ListNode next = curr.next;
//    while(temp>0&&curr!=null){
//        next = curr.next;
//        curr.next = prev;
//        prev = curr;
//        curr = next;
//        temp--;
//    }
//    length-=k;
//    if(curr!=null){
//        if(length>=k)head.next = reverseKGroup(curr,k);
//        else head.next = curr;
//    }
//    return prev;
//}
//private int getLength(ListNode head){
//    int c=0;
//    while(head!=null){
//        head = head.next;
//        c++;
//    }return c;}
//



//private TreeNode invertTree(TreeNode root) {
//    if(root==null)return null;
//    TreeNode temp = root.left;
//    root.left = root.right;
//    root.right = temp;
//    invertTree(root.left);
//    invertTree(root.right);
//    return root;
//}


