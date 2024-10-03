public class Solutions {
    public List<Integer> inordertraversal (TreeNode root){
        List<Integer> res = new ArrayList<>();{
            inorder(root, res);
            return res;
        }
        public void inorder(TreeNode node, List<Integer> res){
            if (node == null){
                return;
            }
            inorder(node.val);
            res.add(node.right, res);
            
        }
    }
    
}
