public class TreeTest {

    public static void main(String[] args) {
        Tree myTree = new Tree();
        int intVal;

        System.out.println("Inseting the following values: ");

        for (int i = 1; i <= 10; i++){
            intVal = (int) (Math.random() * 100);
            System.out.println(intVal + " ");
            myTree.insertNode(intVal);
        }

        System.out.println("\n\nPreorder traversal");
        myTree.preorderTraversal();

        System.out.println("\n\nInorder traversal");
        myTree.inorderTraversal();

        System.out.println("\n\nPostorder traversal");
        myTree.postorderTraversal();
        System.out.println();
        System.exit(0);
    }
}
