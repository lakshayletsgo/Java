public class ReLeetCode_151 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int buy = -prices[0];
        int sell =0;
        int cd = 0;    //cooldown
        for(int i =1; i<prices.length; i++){
            int nbuy = Math.max(buy, cd - prices[i]);
            int nsell = Math.max(sell, buy + prices[i]);
            int ncd = Math.max(cd, sell);

            buy = nbuy;
            sell = nsell;
            cd = ncd;
        }
        return sell;
    }
}
