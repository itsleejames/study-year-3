public class TreeTest {

    public static void main(String[] args) {
        Tree myTree = new Tree();
        int[] numbers = {1, 2, 3, 4, 5,6,7,8};

        System.out.println("Inserting the following values:");

        for (int val : numbers) {
            System.out.print(val + " ");
            myTree.insertNode(val);
        }

        System.out.println("\n\nPreorder traversal:");
        myTree.preorderTraversal();

        System.out.println("\n\nInorder traversal:");
        myTree.inorderTraversal();

        System.out.println("\n\nPostorder traversal:");
        myTree.postorderTraversal();

        System.out.println();
    }
}
