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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<>();
        traverse(root,al);
        return al;
    }
    public void traverse(TreeNode r,ArrayList<Integer> al){
        if(r!=null)
        { 
            al.add(r.val);
            traverse(r.left,al);
           traverse(r.right,al);
        }
    }
}