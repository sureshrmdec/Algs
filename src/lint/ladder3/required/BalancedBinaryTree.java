package lint.ladder3.required;

import common.datastructure.TreeNode;

/**
 * Medium Balanced Binary Tree

40% Accepted
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Have you met this question in a real interview? Yes
Example
Given binary tree A={3,9,20,#,#,15,7}, B={3,#,20,15,7}

A)  3            B)    3 
   / \                  \
  9  20                 20
    /  \                / \
   15   7              15  7
The binary tree A is a height-balanced binary tree, but B is not.	
 * @author xuanlin
 *
 */
public class BalancedBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }
    
    private int maxDepth(TreeNode root) {
    	if (root == null) {
    		return 0;
    	} 
    	
    	int left =  maxDepth(root.left);
    	int right = maxDepth(root.right);
    	
    	if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
    		return -1;
    	}
    	
    	return Math.max(left, right) + 1;
    }

}
