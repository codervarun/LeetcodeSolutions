
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PostOrder {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lstorder = new ArrayList<>();
        if( root ==null){
            return lstorder;
        }
        Stack<TreeNode> s = new Stack<>();

        while(true){

            while(root!=null){
                s.push(root);
                lstorder.add(root.val);
                root  = root.left;
            }

            if(!s.isEmpty()){
                root = s.pop();

            }else{
                break;
            }
            root = root.right;
        }

        return lstorder;

    }
}