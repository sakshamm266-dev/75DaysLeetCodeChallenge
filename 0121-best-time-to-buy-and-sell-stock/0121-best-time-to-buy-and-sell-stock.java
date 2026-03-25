class Solution {
    public int maxProfit(int[] prices) {
        int buyP=Integer.MAX_VALUE;
        int maxPft=0;
        for(int i=0;i<prices.length;i++){
            if(buyP<prices[i]){
                int profit=prices[i]-buyP;
                maxPft=Math.max(profit,maxPft);
                }else{
                    buyP=prices[i];
                }
        }
        return(maxPft);
    }
}