public class ReLeetCode_27 {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{2}));
    }

//    This is a brute force approach
//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        double ans = 0.0;
//        int[]newArr = new int[nums1.length+nums2.length];
//        int temp=0;
//        int temp2= 0;
//        for(int i=0;i<newArr.length&&temp2<nums2.length&&temp< nums1.length;i++){
//            if(nums1[temp]<nums2[temp2]){
//                newArr[i] = nums1[temp];
//                temp++;
//            }else {
//                newArr[i] = nums2[temp2];
//                temp2++;
//            }
//        }
//        if(temp<nums1.length){
//            for (int i=temp;i<nums1.length;i++){
//                newArr[i] = nums1[temp];
//                temp++;
//            }
//        }else{
//            for (int i=temp2;i<nums2.length;i++){
//                newArr[i] = nums2[temp2];
//                temp2++;
//            }
//        }
//        if(newArr.length%2==0){
//            return (double)(newArr[newArr.length/2]+newArr[(newArr.length/2)-1])/2;
//        }else{
//            return (double) newArr[newArr.length/2];
//        }
//    }



    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int n = nums2.length;
        int m = nums1.length;

        int l = 0,r = m,halfLength = (n+m+1)/2;
        while (l<=r){
            int i=(l+r)/2;
            int j = halfLength-i;
            if(i<r&&nums1[i]<nums2[j-1]){
                l = i+1;
            } else if (i > l && nums1[i - 1] > nums2[j]) {
                r = i-1;
            }else{
                int maxLeft = 0;
                if(i==0){
                    maxLeft = nums2[j-1];
                    
                } else if (j == 0) {
                    maxLeft = nums1[i-1];
                }else{
                    maxLeft = Math.max(nums1[i-1],nums2[j-1]);
                }
                if((m+n)%2==1){
                    return maxLeft;
                }
                int minRight = 0;
                if(i==m){
                    minRight = nums2[j];
                } else if (j == n) {
                    minRight = nums1[i];
                }else{
                    minRight = Math.max(nums1[i],nums2[j]);
                }
                return (maxLeft+minRight)/2.0;
            }


        }
        return 0.0;
    }
}
