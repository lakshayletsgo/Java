public class Top150_8 {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int minVal = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]-minVal>0){
                ans = Math.max(ans,ans+prices[i]-minVal);
                minVal = prices[i];
            }else minVal = Math.min(minVal,prices[i]);

        }
        return ans;
    }
}
