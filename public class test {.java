public class test {
    // W7 C1 Oct8th
    public Node deleteNode(Nide root, int x){

        if (root = null){
            return root;
        }
        if (root.val > x){
            root.left = deleteNode(root.left, x);
        } 
        else if (root.val < x){
            root.right = = deleteNode(root.left, x);
        }
        else {
            if (root.left = null && root.left = null){
                return null; 
            }
            else if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            else{
                Node replace = getSucessor (root);
                root.val = replace.val;
                root.rigth = deleteNode(root.right, replace.val);
            }
            return root;
        }

        public Node getSuccessor (Node curr){
            curr = curr.right;
            while(curr != null && curr.left != null){
                curr = curr.left;
            }
        }
    }
    
}
