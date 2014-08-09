import java.util.*;

public class Binary_Tree_Inorder_Traversal{
   public static void main(String [] args){
      TreeNode root = new TreeNode(1);
      //root.left = new TreeNode(2);
      root.right = new TreeNode(3);
      //root.left.right = new TreeNode(3);
      /*
      root.left = new TreeNode(2);
      root.left.left = new TreeNode(3);
      root.left.right = new TreeNode(4);
      root.right = new TreeNode(5);
      root.right.left =new TreeNode(6);
      root.right.right = new TreeNode(7);
      */ 
      List<Integer> list =  inorderTraversal(root);
      System.out.println(list);
   }

   public static List<Integer> inorderTraversal(TreeNode root){

      ArrayList<Integer> listHead = new ArrayList<Integer>();
      Stack<TreeNode> parentStack = new Stack<TreeNode>();
      boolean is_down = true;

      if(root == null)
         return listHead;

      TreeNode curPos = root;
      while(true){
         if(curPos == null){
            if(parentStack.empty())
               break;
            curPos = parentStack.pop();
            is_down = false;
            continue;
         }
         if(is_down == false){
            listHead.add(curPos.val);
            if(curPos.right != null){
               curPos =curPos.right;
               is_down = true;
            }
            else{
               if(parentStack.empty())
                  break;
               else
                  curPos = parentStack.pop();
               is_down = false;
            }
         }
         else{ //is_down == true
            if(curPos == null){
               if(parentStack.empty())
                  break;
               curPos = parentStack.pop();
            }
            else if(curPos.left != null){
               parentStack.push(curPos);
               curPos = curPos.left;
               is_down = true;
            }
            else if(curPos.right != null){
               listHead.add(curPos.val);
               curPos = curPos.right;
               is_down = true;
            }
            else {
               System.out.println("3:"+curPos.val);
               listHead.add(curPos.val);
               if(parentStack.empty())
                  break;
               curPos = parentStack.pop();
               is_down = false;
            }
         }
      }
      return listHead;
   }
   
   public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
