class Solution {
    public int goodNodes(TreeNode root) {
        if(root==null)
        {
            return  0;
        }
        return solve(root,root.val); 
    }
    
    int solve(TreeNode root,int max)
    {
        if(root==null)
        {
            return  0;
        }
        max = Math.max(root.val,max);
        if(root.val>=max)
        {
            return 1 + solve(root.left,max) + solve(root.right,max);
        }
        else
        {
            return solve(root.left,max) + solve(root.right,max);
        }
    }
}
