import java.security.PublicKey;

public class Tree {
    private TreeNode root;

    // Construct an empty tree of integers
    public Tree() {
        root = null;
    }

    // Insert a node
    public void insertNode(int d) {
        if (root == null)
            root = new TreeNode(d);
        else
            root.insert(d);
    }

    // --- PREORDER ---
    public void preorderTraversal() {
        preorderHelper(root);
    }

    private void preorderHelper(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");  // Visit node first
        preorderHelper(node.left);          // Then left
        preorderHelper(node.right);         // Then right
    }

    // --- INORDER ---
    public void inorderTraversal() {
        inorderHelper(root);
    }

    private void inorderHelper(TreeNode node) {
        if (node == null)
            return;
        inorderHelper(node.left);           // Visit left first
        System.out.print(node.data + " ");  // Then node
        inorderHelper(node.right);          // Then right
    }

    // --- POSTORDER ---
    public void postorderTraversal() {
        postorderHelper(root);
    }

    private void postorderHelper(TreeNode node) {
        if (node == null)
            return;
        postorderHelper(node.left);
        postorderHelper(node.right);
        System.out.print(node.data + " ");
    }

    // --- SEARCH ---
    public TreeNode treeSearch(TreeNode tNode, int target) {
        if (tNode != null) {
            if (target < tNode.data)
                tNode = treeSearch(tNode.left, target);
            else if (target > tNode.data)
                tNode = treeSearch(tNode.right, target);
        }
        return tNode;
    }

//    public TreeNode treeSearch(TreeNode tNode, int target)
//    {
//
//    }
}
