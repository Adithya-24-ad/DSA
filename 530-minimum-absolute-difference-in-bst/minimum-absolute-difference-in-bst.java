/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int getMinimumDifference(TreeNode root) {
        if(root==null) return 0;
		int minDiff=Integer.MAX_VALUE;
		TreeNode prev=null;
		Stack<TreeNode> stack=new Stack<>();
		TreeNode current=root;
		while(current!=null || !stack.isEmpty()) {
			while(current!=null) {
				stack.push(current);
				current=current.left;
			}
			current=stack.pop();
			if(prev!=null) {
				minDiff=Math.min(minDiff,Math.abs(current.val-prev.val));
			}
			prev=current;
			current=current.right;
		}
		return minDiff;
    }
}