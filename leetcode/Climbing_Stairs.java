public class Climbing_Stairs{
   public static void main(String [] args){
      System.out.println(climbStairs(3));
      System.out.println(climbStairs(5));
      System.out.println(climbStairs(44));
   }

   public static int climbStairs(int n){
      if( n == 0 || n == 1)
         return 1;
      int stepOne = 1;
      int stepTwo = 1;
      int result = 0;
      for( int i= 2; i<= n; i++){
        result = stepOne + stepTwo;
        stepOne = stepTwo;
        stepTwo = result;
      }
      return result;
   }
}
