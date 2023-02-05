// package tree;

class TreeNode {

    int val;
    
    TreeNode left, right;

    public TreeNode(int val) {

        this.val = val;
    }
}

public class InOrder {

    private TreeNode root;

    public InOrder() {
        
        this.root = null;
    }

    void inOrder(TreeNode temp) {

        if(temp == null) return;
            
        inOrder(temp.left); // go through left subtree

        System.out.print(temp.val + " ");

        inOrder(temp.right); // go through right subtree
    }

    public static void main(String[] args) {

        InOrder tree = new InOrder();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(3);
        tree.root.right = new TreeNode(2);
        tree.root.right.right = new TreeNode(4);
        tree.root.right.left = new TreeNode(5);
        tree.root.left.left = new TreeNode(6);
        tree.root.left.right = new TreeNode(7);

        tree.inOrder(tree.root);
    }
}