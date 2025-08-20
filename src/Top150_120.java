public class Top150_120 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length>nums2.length){
            int []temp=nums1;
            nums1=nums2;
            nums2=temp;
        }
        int n =nums1.length;
        int m =nums2.length;
        int left = 0;
        int right=n;
        while(left<=right){
            int part1=(left+right)/2;
            int part2=(n+m+1)/2-part1;
            int maxLeft1=part1>0?nums1[part1-1]:Integer.MIN_VALUE;
            int maxLeft2=part2>0?nums2[part2-1]:Integer.MIN_VALUE;
            int maxLeft=Math.max(maxLeft1,maxLeft2);

            int maxRight1= part1<n?nums1[part1]:Integer.MAX_VALUE;
            int maxRight2= part2<m?nums2[part2]:Integer.MAX_VALUE;
            int maxRight=Math.min(maxRight1,maxRight2);

            if(maxLeft<=maxRight){
                if((n+m)%2==0)return (maxLeft+maxRight)/2.0;
                else return maxLeft;
            }else if(maxLeft1>maxRight2)right=part1-1;
            else left= part1+1;
        }
        return 0.0;

    }
}
