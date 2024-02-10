class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value) {
        this.value = value;
        this.left = this.right = null;
    }
}

public class Kenan_Imamovic_Heap {

    public static void main(String[] args) {
        // Example where is heap
        TreeNode root1 = new TreeNode(97);
        root1.left = new TreeNode(46);
        root1.right = new TreeNode(37);
        root1.left.left = new TreeNode(12);
        root1.left.right = new TreeNode(3);
        root1.right.left = new TreeNode(7);
        root1.right.right = new TreeNode(31);
        root1.left.left.left = new TreeNode(6);
        root1.left.left.right = new TreeNode(9);

        // Example where it is not a heap
        TreeNode root2 = new TreeNode(97);
        root2.left = new TreeNode(46);
        root2.right = new TreeNode(37);
        root2.left.left = new TreeNode(12);
        root2.left.right = new TreeNode(3);
        root2.right.left = new TreeNode(7);
        root2.right.right = new TreeNode(31);
        root2.right.left.left = new TreeNode(2);
        root2.right.left.right = new TreeNode(4);

        // Check if the binary trees are max-heaps
        System.out.println("Example 1: " + (isMaxHeap(root1) ? "The binary tree is a max-heap." : "The binary tree is not a max-heap."));
        System.out.println("Example 2: " + (isMaxHeap(root2) ? "The binary tree is a max-heap." : "The binary tree is not a max-heap."));
    }

    public static boolean isMaxHeap(TreeNode root) {
        if (root == null) {
            return true;  // An empty tree is a max-heap
        }

        // Check if the tree is complete
        if (!isComplete(root, 0, addNodes(root))) {
            return false;
        }

        // Check the max-heap property
        return isMax(root);
    }

    private static boolean isMax(TreeNode root) {
        if (root == null) {
            return true;
        }

        // For each node, check if its value is greater than or equal to its child nodes
        if (root.left != null && root.left.value > root.value) {
            return false;
        }

        if (root.right != null && root.right.value > root.value) {
            return false;
        }

        // Recursively check the left and right subtrees
        return isMax(root.left) && isMax(root.right);
    }

    private static boolean isComplete(TreeNode root, int index, int totalNodes) {
        if (root == null) {
            return true;
        }

        // Check if the index of the current node is less than the total number of nodes
        if (index >= totalNodes) {
            return false;
        }

        // Recursively check the left and right subtrees
        return isComplete(root.left, 2 * index + 1, totalNodes)
                && isComplete(root.right, 2 * index + 2, totalNodes);
    }

    private static int addNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + addNodes(root.left) + addNodes(root.right);
    }
}
