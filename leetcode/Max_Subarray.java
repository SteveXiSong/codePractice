public class Max_Subarray{
   public static void main(String [] args){
      int [] A = {2, -4, 3, -2, -4, 10};
      System.out.println(maxSubarray(A));
   }


   public static int maxSubarray(int [] A){
      int [] subSum = new int [A.length];
      int maxSum = 0;
      subSum[0] = A[0];
      for( int i = 1; i < A.length; i++){
         if( subSum[i-1] < 0)
            subSum[i] = A[i];
         else 
            subSum[i] = subSum[i-1]+A[i];

         if( maxSum< subSum[i])
            maxSum=subSum[i];
      }
      return maxSum;
   }
}
