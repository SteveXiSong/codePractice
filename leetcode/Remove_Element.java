public class Remove_Element{
   public static void main(String[] args){

      int [] A = {0, 1, 2, 3, 4, 5};
      int len;
      System.out.println(len= removeElement(A, 3));
      for(int i = 0; i <len; i++)
         System.out.print(A[i] + " ");

      int [] B = {3,3};
      System.out.println(len = removeElement(B, 3));
      for(int i = 0; i <len; i++)
         System.out.print(B[i] + " ");
   }

   public static int removeElement(int[] A, int elem){
      int retLen = A.length;
      if(retLen == 1)
         if(A[0] == elem)
            return 0;
         else return 1;

      for (int i = 0; i < retLen; i++){
         if(A[i] == elem){
            A[i] = A[retLen-1];
            i--;
            retLen--;
         }
      }
      return retLen;
   }
}
