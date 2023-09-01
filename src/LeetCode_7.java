//https://leetcode.com/problems/buy-two-chocolates/
import java.util.Arrays;

public class LeetCode_7 {
    public static void main(String[] args) {
        int []arr = {98,54,6,34,66,63,52,39};
        System.out.println(buyChoco(arr,62));
    }
    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        for(int i=1;i<prices.length;i++){

//            Iske baad mere pass ek sorted array jisme ek pointer point kar rha hai 0 index of prices jo hai minimum iske baad main check karta rahuga jab tak uske jitne ya usse less ka sum mil jaye
//

            if(prices[0]+prices[i]==money){
//                Yaha par mere pass usse kam ya vahi money hai agr vahi hai to simple return karwa deta hu
                return 0;
            } else if (prices[0]+prices[i]<money) {
//                Ab yaha par aaya hai iska matlab muje yeh check karna hai kitna hai

                return money-prices[0]-prices[i];
            }
        }

        return money;
    }
}