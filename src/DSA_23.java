//Finding the square root of a number
public class DSA_23 {
    public static void main(String[] args) {
        int n = 30;
        int decimalPlace = 3;
        System.out.printf("%.3f  ",sqrt(n,decimalPlace));
        System.out.println(root(30));
    }
    static double sqrt(int n,int a){
        int s = 0;
        int e = n;
        double root = 0.0;
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid<=n){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        double inc = 0.1;
        for(int i=0;i<a;i++){
            while (root*root<=n){
                root+=inc;
            }
            root-=inc;
            inc/=10;
        }
        return root;
    }

    static double root(double n){
        double x = n;
        double root;
        while(true){
            root = 0.5*(x+n/x);
            if(Math.abs(root-x)<0.1 ){
                break;
            }
            x = root;

        }
        return root;
    }
}
