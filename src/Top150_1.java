public class Top150_1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = n+m;
        int[]ans= new int[size];
        int x=0,y=0;
        int temp=0;
        for(int i=m;i<size&&x<n;i++){
            nums1[i] = nums2[x];
            x++;
        }
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(nums1[i]>nums1[j]){
                    int te = nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=te;
                }
            }
        }
    }
}
