package tree;

public class MyBinarySearchTree {

    private Node rootNode;

    public MyBinarySearchTree() {
        rootNode = null;
    }

    @Override
    public String toString() {
        return "MyBinarySearchTree{" +
                "rootNode=" + rootNode +
                '}';
    }

    private void insert(int i) {
        if (rootNode == null) {
            rootNode = new Node(i);
            return;
        }
        Node currentNode = rootNode;
        while (true) {
            if (i < currentNode.data) {
                if (currentNode.leftNode == null) {
                    currentNode.leftNode = new Node(i);
                    return;
                } else
                    currentNode = currentNode.getLeftNode();
            } else if (i > currentNode.data) {
                if (currentNode.getRightNode() == null) {
                    currentNode.setRightNode(new Node(i));
                    return;
                } else
                    currentNode = currentNode.getRightNode();
            }
        }
    }

    private boolean lookup(int i) {
        Node currentNode = rootNode;
        while (currentNode != null) {
            if (i == currentNode.data)
                return true;
            else if (i > currentNode.data)
                currentNode = currentNode.rightNode;
            else
                currentNode = currentNode.leftNode;
        }
    }

    public static void main(String[] args) {

        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(9);
        bst.insert(4);
        bst.insert(6);
        bst.insert(20);
        bst.insert(170);
        bst.insert(15);
        bst.insert(1);
        System.out.println(bst.lookup(0));
        System.out.println(bst);

    }

    private class Node {
        private int data;
        private Node leftNode;
        private Node rightNode;

        public Node(int data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }

        public Node getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(Node leftNode) {
            this.leftNode = leftNode;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }

        @Override
        public String toString() {
            return "\nNode{" +
                    "data=" + data +
                    ", leftNode=" + leftNode +
                    ", rightNode=" + rightNode +
                    '}';
        }
    }

}

