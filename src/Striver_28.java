public class Striver_28 {
    public double myPow(double x, int n) {
        return helper(x,(long)n);
    }
    private double helper(double x,long n){
        if(n<0)return 1.0/helper(x,-n);
        if(n==0)return 1.0;
        return n%2==1?x*helper(x*x,(n-1)/2):helper(x*x,n/2);
    }
}
