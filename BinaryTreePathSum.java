/*class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};*/

class Solution {
  public static boolean hasPath(TreeNode root, int sum) {
    // TODO: Write your code here
    if(root == null) {
      return false;
    }

    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    while(!stack.isEmpty()) {
      TreeNode currentNode = stack.pop();
      
      if(currentNode.left == null && currentNode.right == null && currentNode.val == sum) {
        return true;
      }

      if(currentNode.right != null) {
        currentNode.right.val += currentNode.val;
        stack.push(currentNode.right);
      }

      if(currentNode.left != null) {
        currentNode.left.val += currentNode.val;
        stack.push(currentNode.left);
      }
    }
    return false;
  }
}
