public class DSA_7 {
    public static void main(String[] args) {
        int [] arr = {2,5,10,2,1};
        System.out.println(peakIndexInMountain(arr));
    }
    static int peakIndexInMountain(int[]arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end =mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
