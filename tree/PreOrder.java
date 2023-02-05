// package tree;

class TreeNode {

    int value;
    TreeNode left, right;

    public TreeNode(int val) {

        this.value = val;
        left = right = null;
    }
}
public class PreOrder {
    
    // Root of the binary tree

    TreeNode root;

    public PreOrder() {
        this.root = null;
    }

    void preOrder(TreeNode ptr) {

        if(ptr == null) return;
        System.out.print(ptr.value + " ");

        // first call the left subtree...
        preOrder(ptr.left);
        // second call the right subtree
        preOrder(ptr.right);
        
    }

    public static void main(String[] args) {
        
        PreOrder tree = new PreOrder();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(3);
        tree.root.right = new TreeNode(2);
        tree.root.right.right = new TreeNode(4);
        tree.root.right.left = new TreeNode(5);
        tree.root.left.left = new TreeNode(6);
        tree.root.left.right = new TreeNode(7);

        tree.preOrder(tree.root);
    }

}
