class Solution {
    int ans = 0 ;
    public int sum(TreeNode n){
        int s = 0 ;
        if(n.left != null){
        if(n.left.left != null){
            s += n.left.left.val ;
        }
        if(n.left.right != null){
            s += n.left.right.val ;
        }
        }
        if(n.right == null){
            return s;
        }
        if(n.right.left != null){
            s += n.right.left.val ;
        }
        if(n.right.right != null){
            s += n.right.right.val ;
        }
        return s ;
    }
    public void order(TreeNode n){
        if(n == null){
            return;
        }
        if(n.val % 2 == 0){
            ans += sum(n) ;
        }
        order(n.left) ;
        order(n.right) ;
    }
    public int sumEvenGrandparent(TreeNode root) {
        order(root) ;
        return ans;
    }
}