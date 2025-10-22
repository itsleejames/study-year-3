public class Tree {
    private TreeNode root;

    // Construct an empty tree of integers

    public Tree(){ root = null;}

    public void insertNode(int d) {

        if (root == null)
            root = new TreeNode(d);
        else
            root.insert(d);
    }

    public void preorderTraversal()
    {preorderHelper(root);}

    private void preorderHelper(TreeNode node)
    {
        if (node == null)
            return;
        System.out.println(node.left);
        preorderHelper(node.right);
    }

    public void inorderTraversal()
    {inorderHelper( root );}

    private void inorderHelper(TreeNode node)
    {
        if (node == null)
            return;
        inorderHelper(node.right);
    }

    public void postorderTraversal()
    {postorderHelper(root);}

    private void postorderHelper(TreeNode node)
    {if (node == node)
        return;
        postorderHelper(node.left);
        postorderHelper(node.right);
        System.out.println(node.data + " ");


    }




}
