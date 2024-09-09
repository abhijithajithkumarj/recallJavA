package DataStructure.Trees;

public class AVLTree {

    private Node root;

    private class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
            this.height = 1; // Height is 1 for a new node
        }
    }

    public AVLTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) return new Node(value);

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        } else {
            // Duplicate values are not allowed in this AVL Tree
            return node;
        }

        // Update the height of the current node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Balance the node
        return balance(node);
    }

    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    private int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    private Node balance(Node node) {
        int balance = getBalance(node);

        // Left heavy subtree
        if (balance > 1) {
            if (getBalance(node.left) < 0) {
                node.left = leftRotate(node.left); // Left-Right case
            }
            return rightRotate(node); // Left-Left case
        }

        // Right heavy subtree
        if (balance < -1) {
            if (getBalance(node.right) > 0) {
                node.right = rightRotate(node.right); // Right-Left case
            }
            return leftRotate(node); // Right-Right case
        }

        return node; // Node is already balanced
    }

    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x; // Return new root
    }

    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y; // Return new root
    }

    // Additional methods like delete, search, and traversal can be added as needed

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        System.out.println("Preorder traversal of the AVL tree is:");
        tree.preOrderTraversal(); // Output should show a balanced AVL tree
    }
}

