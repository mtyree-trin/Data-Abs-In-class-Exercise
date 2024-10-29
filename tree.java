public class tree {
    public Node sortArrayToTree(int[] nums){
        int n = nums.length;
        if (n == 0)
            return null;
        
        return helper(nums, )
    }
    public Node helper(int[], nums, int s int e){

        if (s>e){
            return null;
        }
        int mid = s + (e-s) /2;

        Node node = new Node(nums[mid]);

        node.left = helper(nums, s, mid -1);
        node.right = helper(nums, mid +1, e);
    }
}
