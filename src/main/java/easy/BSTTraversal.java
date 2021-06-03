package easy;/**
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
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode() {}

      TreeNode(int val) { this.val = val; }

      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

class BSTTraversal
{
    public String tree2str(TreeNode root)
    {
        StringBuilder str = new StringBuilder(); //this allows us to append
        //without worrying about
        //initializing the String
        traverse(root, str); //helper method
        return str.toString(); //return the StringBuilder as a String
    }

    public void traverse(TreeNode root, StringBuilder str)
    {
        if(root == null) return; //base case, exit when we hit the end of a node

        str.append(root.val); //add the root's int value to start

        if(root.left != null || root.right != null){ //if there's only 1 child node
            str.append("(");
            traverse(root.left, str); //recursively traverse to the left
            str.append(")");
        }

        if(root.right != null){ //once we've left the first if, only traverse to the right
            str.append("(");
            traverse(root.right, str); //traverse to the right
            str.append(")");
        }
    }
}
