public class ReLeetCode_165 {
    public static void main(String[] args) {

    }
    public int getSum(int a, int b) {
        while (b!=0){
            int temp = (a&b)<<1;
            a = a^b;
            b = temp;
        }
        return a;
    }
}
