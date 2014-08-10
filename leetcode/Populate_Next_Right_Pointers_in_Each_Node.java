/**
 * Definition for binary tree with next pointer.
 */
 
public class Populate_Next_Right_Pointers_in_Each_Node {

   public static void main(String [] args){

      TreeLinkNode root = new TreeLinkNode(0);
      root.left = new TreeLinkNode(1);
      root.right = new TreeLinkNode(2);
      root.left.left = new TreeLinkNode(3);
      root.left.right = new TreeLinkNode(4);
      root.right.left = new TreeLinkNode(5);
      root.right.right = new TreeLinkNode(6);

      connect(root);
      TreeLinkNode it = root;
      TreeLinkNode lastIt = root;
      for( ; it !=null; it = lastIt.left){
         lastIt = it;
         for( ; it!=null; it = it.next){
            System.out.print(it.val+" ");
         }
         System.out.println();
      }
   }

   public static void connect(TreeLinkNode root) {
       if(root == null || root.left ==null)
          return;

       TreeLinkNode it = root;
       TreeLinkNode lastLvlIt = root;
       int depth = 0;
       int real_length = (int)Math.pow(2,depth);

       for(it =root; it != null; it =lastLvlIt.left, depth++){
         lastLvlIt = it; 
         real_length = (int)Math.pow(2,depth);

         //System.out.println("D("+depth+")"+"L("+length+")");
         
         int real_num =1;

         TreeLinkNode lastIt = it;
         TreeLinkNode seekNext=root;

         while(real_num < real_length){
            System.out.println("here:lastIt("+lastIt.val+")");
            int curDepth =0;
            int num = real_num;
            int length = real_length;
            seekNext = root;

            for( ;curDepth <depth; curDepth++, length = length/2){
               System.out.println("num("+num+")"+"L("+length+")"+"curD("+curDepth+")"+"D("+depth+")");

               if(num <  length/2){
                  seekNext = seekNext.left;
               }
               else{
                  seekNext = seekNext.right;
                  num -= length/2;
               }
            }
            System.out.println("next("+seekNext.val+")");
            lastIt.next = seekNext;
            lastIt = lastIt.next;
            real_num++;
         }
      }
   }

   public static class TreeLinkNode {
       int val;
       TreeLinkNode left, right, next;
       TreeLinkNode(int x) { val = x; }
   }
}
