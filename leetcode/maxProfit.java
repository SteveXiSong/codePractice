public class maxProfit {
   public static void main(String [] args){
      int[] prices = { 3, 2, 5, 0, 4};
      for(int i =0; i<prices.length ;i++)
         System.out.println(prices[i]);
      int profit = maxProfit(prices);
      System.out.println(profit);
   }

   public static int maxProfit(int[] prices) {
      int [] profitArray = new int[prices.length-1];

      if(prices.length == 1 || prices.length ==0)
         return 0;

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
