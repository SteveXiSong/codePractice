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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
            ArrayList<Integer> retList = new ArrayList<Integer>();
	        Stack<TreeNode> parentStack = new Stack<TreeNode>();
	        parentStack.push(null);
	        if(root == null) return retList;
	        TreeNode curRoot = root;
	        while(curRoot!= null){
	        	retList.add(curRoot.val);
	        	if(curRoot.right!=null)
	        		parentStack.push(curRoot.right);
	        	if(curRoot.left!=null)
	        		parentStack.push(curRoot.left);
	        	curRoot=parentStack.pop();
	        }
	     return retList;   
    }
}
