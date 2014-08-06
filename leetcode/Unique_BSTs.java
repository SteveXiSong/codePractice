public class Unique_BSTs{
   public static void main(String[] args){
      System.out.println(numTrees(5));
   }

   public static int numTrees(int n){
      System.out.println(n);
      if( n == 3)
         return 5;
      if(n ==2)
         return 2;
      if(n==1)
         return 1;
      if(n==0)
         return 0;

      int numTrees =0;
      int left =0, right =0;

      for(int i =1; i <=n; i++){
        left = i-1;
        right = n-i;
        numTrees += numTrees(left) * numTrees(right) ;
      }

      return numTrees; 
   }

}

