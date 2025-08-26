public class Top150_134 {
    public int mySqrt(int x) {
        return (int)binarySearch(x,0,x/2);
    }
    private long binarySearch(long x, long left, long right){
        long mid=left-(left-right)/2;
        if(left*left==x)return left;
        else if(right*right==x)return right;
        else if(mid*mid==x||left>right)return mid;
        else if(mid*mid<x){
            if((mid+1)*(mid+1)>x)return mid;
            else left = mid+1;
        }
        else if(mid*mid>x)right = mid-1;

        return binarySearch(x,left,right);
    }
}
