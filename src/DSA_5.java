import java.util.Arrays;

//Start and End Position of an element
public class DSA_5 {
    public static void main(String[] args) {
        int [] arr = {3,6,12,12,12,34,45};
        int target = 12;
        System.out.println(Arrays.toString(startEndPosition(arr, target)));
    }
    static int[] startEndPosition(int[] arr,int target){
        int []ans = {-1,-1};
        int start = getIndex(arr,target,true);
        int end = getIndex(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int getIndex(int []arr, int target,boolean startIndex){
        int ans= -1;
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end= mid-1;
            } else if (target>arr[mid]){
                start = mid+1;
            }else {
                ans = mid;
                if(startIndex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }return ans;
    }
}
