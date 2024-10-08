public class maxValBiSearch {
    node left;
    int val;
    node right;
 
    int min(){
        node curr = root;
        while(curr != null){
            curr = curr.left;
        }
        return curr.val;
    
    }
    int max(){
        Node curr = root;
        while(curr != null){
            curr = curr.right;
        }
        return curr.val;

    } 

    // Height Balanced
    
 

}
