package tree;

class TreeNode {

    int value;
    TreeNode left, right;

    public TreeNode(int val) {

        this.value = val;
        left = right = null;
    }
}
public class PostOrder {
    
    // Root of the binary tree

    TreeNode root;

    public PostOrder() {
        this.root = null;
    }

    void postorder(TreeNode ptr) {

        if(ptr == null) return;

        // first call the left subtree...
        postorder(ptr.left);

        // second call the right subtree
        postorder(ptr.right);

        System.out.print(ptr.value + " ");
    }

    public static void main(String[] args) {
        
        PostOrder tree = new PostOrder();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(3);
        tree.root.right = new TreeNode(2);
        tree.root.right.right = new TreeNode(4);
        tree.root.right.left = new TreeNode(5);
        tree.root.left.left = new TreeNode(6);
        tree.root.left.right = new TreeNode(7);

        tree.postorder(tree.root);
    }

}
