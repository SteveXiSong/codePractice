/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
           ArrayList<Integer> retList = new ArrayList<Integer>();
	        Stack<TreeNode> parentStack = new Stack<TreeNode>();
	        if(root==null) return retList;
	        TreeNode lastVisited = root;
	        TreeNode curRoot = root;
	        do{
	    	  if(curRoot.left!=null	 && (lastVisited != curRoot.left && lastVisited != curRoot.right)){
	    		  parentStack.push(curRoot);
	    		  curRoot=curRoot.left;
	    	  }
	    	  else 
	    	  if(curRoot.right!=null && lastVisited != curRoot.right){
	    		  parentStack.push(curRoot);
	    		  curRoot=curRoot.right;
	    	  } else{
	    	    retList.add(curRoot.val);
	    	    lastVisited=curRoot;
	    	    if(lastVisited == root) break;
	    	    curRoot=parentStack.pop();
	    	  }
	        }while( lastVisited !=root || !parentStack.isEmpty());
	        return retList;     
    }
}
