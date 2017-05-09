package main.collections;

public class MyTreeSort {
    public Node root;

    public void insertNewNode(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        insertNode(root, node);
    }

    private void insertNode(Node latestRoot, Node node) {
        if (latestRoot.value > node.value) {
            if (latestRoot.left == null) {
                latestRoot.left = node;
                return;
            } else {
                insertNode(latestRoot.left, node);
            }
        } else {
            if (latestRoot.right == null) {
                latestRoot.right = node;
                return;
            } else {
                insertNode(latestRoot.right, node);
            }
        }
    }

    boolean bst = isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    public boolean isBST(Node root, int min, int max) {
        if(root == null)
            return true;

        return (root.value > min &&
                root.value < max &&
                isBST(root.left, min, root.value) &&
                isBST(root.right, root.value, max));
    }

    public int findMinimum() {
        if (root == null) {
            return 0;
        }
        Node currNode = root;
        while (currNode.left != null) {
            currNode = currNode.left;
        }
        return currNode.value;
    }

    public int findMaximum() {
        if (root == null) {
            return 0;
        }
        Node currNode = root;
        while (currNode.right != null) {
            currNode = currNode.right;
        }
        return currNode.value;
    }

    public void printInorder() {
        printInOrderRec(root);
        System.out.println("");
    }

    //Helper method to recursively print the contents in an inorder way
    private void printInOrderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }
        printInOrderRec(currRoot.left);
        System.out.print(currRoot.value + ", ");
        printInOrderRec(currRoot.right);
    }

    //Printing the contents of the tree in a Preorder way.
    public void printPreorder() {
        printPreOrderRec(root);
        System.out.println("");
    }

    //Helper method to recursively print the contents in a Preorder way
    private void printPreOrderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }
        System.out.print(currRoot.value + ", ");
        printPreOrderRec(currRoot.left);
        printPreOrderRec(currRoot.right);
    }

    //Printing the contents of the tree in a Postorder way.
    public void printPostorder() {
        printPostOrderRec(root);
        System.out.println("");
    }

    //Helper method to recursively print the contents in a Postorder way
    private void printPostOrderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }
        printPostOrderRec(currRoot.left);
        printPostOrderRec(currRoot.right);
        System.out.print(currRoot.value + ", ");
    }

    public void search(Node n, int value) {
        if (n.value == value || n == null) {
            System.out.println("\nFound Value: " + n.value);
        } else if (value < n.value) {
            search(n.left, value);
        } else {
            search(n.right, value);
        }
    }

    class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String args[]) {
        MyTreeSort myTreeSort = new MyTreeSort();
        myTreeSort.insertNewNode(4);
        myTreeSort.insertNewNode(1);
        myTreeSort.insertNewNode(3);
        myTreeSort.insertNewNode(5);
        myTreeSort.insertNewNode(8);
        myTreeSort.printInorder();
        myTreeSort.printPreorder();;
        myTreeSort.printPostorder();
        //System.out.println(myTreeSort.findMinimum());
    }
}