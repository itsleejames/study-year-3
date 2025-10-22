public class TreeNode {
    //Package Access Members
    TreeNode left;
    int data;
    TreeNode right;

    // Constructor
    public TreeNode(int d)
    {
        data = d;
        left = right = null;
    }

    public void insert(int d){
        if (d<data){
            if (left == null)
                left = new TreeNode(d);
            else if (d > data) {
                if (right == null)
                    right = new TreeNode(d);

                else
                    right.insert(d);

            }
        }
    }
}
