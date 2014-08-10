public class Search_Insert_Position {

   public static void main(String [] args){
      int [] testList = {1,  3 , 7, 9};
      System.out.println( searchInsert(testList, 10) );
   }

   public static int searchInsert(int[] A, int target) {
      int it = 0;
      for( it = 0;  it < A.length; it++){
         if( A[it]< target)
            continue;
         if( A[it] == target)
            return it;
         if( A[it] > target)
            return it;
      }
      return it;
   }
}
