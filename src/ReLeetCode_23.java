public class ReLeetCode_23 {
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{30,11,23,4,20},5));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile:piles) max = Math.max(pile,max);
        return binarySearch(piles,1,max,h);
    }
    public static int binarySearch (int[]piles,int left,int right,int h){
        while (left<=right){
            int mid = left+(right-left)/2;
            if(computeData(piles,mid)<=h){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
    public static int computeData(int[]piles,int mid){
        int res = 0;
        for (int pile:piles){
            res+=(mid+pile-1)/mid;
        }
        return res;
    }
}
