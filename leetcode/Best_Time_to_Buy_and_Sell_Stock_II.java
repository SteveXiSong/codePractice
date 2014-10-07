public class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length == 1 || prices.length ==0)
         return 0;
        int [] profitArray = new int[prices.length-1];

        for(int i = 1 ; i<prices.length; i++){
            profitArray[i-1] = prices[i] - prices[i-1];
        }

        int maxProfit=0;
        for(int i =0; i< profitArray.length; i++){
            if(profitArray[i] >0)
                maxProfit+= profitArray[i];
        }
        return maxProfit;
    }
}
