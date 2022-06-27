package tree;

import java.util.ArrayList;
import java.util.Arrays;

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

    /**
     * Using recursion
     */

    private Node insert2(Node root, int i) {
        if (root == null)
            return new Node(i);

        if (root.data > i)
            root.leftNode = insert2(root.leftNode, i);
        else if (root.data < i)
            root.rightNode = insert2(root.rightNode, i);
        return root;
    }

    private void inorderTraversal(Node root) {
        if (root == null)
            return;

        inorderTraversal(root.leftNode);
        System.out.print(root.data + " ");
        inorderTraversal(root.rightNode);
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
        return false;
    }

    /**
     * search or lookup using recursion
     */

    private boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data > key)
            return search(root.leftNode, key);
        else if (root.data == key)
            return true;
        else
            return search(root.rightNode, key);
    }

    private Node delete(Node rootNode, int key) {
        if (rootNode.data > key) {
            rootNode.leftNode = delete(rootNode.leftNode, key);
        } else if (rootNode.data < key) {
            rootNode.rightNode = delete(rootNode.rightNode, key);
        } else {
            /**
             * rootNode.data == key
             * case:1-> where root has no child
             * */
            if (rootNode.leftNode == null && rootNode.rightNode == null)
                return null;
            /**
             * case:2-> where root has one child
             * */
            if (rootNode.leftNode == null)
                return rootNode.rightNode;
            else if (rootNode.rightNode == null)
                return rootNode.leftNode;

            /**
             * case:3-> where root has two children.
             * To do that first we need to find out the inorder successor of that element.
             * and to do so we have to find the left most element of the right sub tree.
             * */

            Node IS = inorderSuccessor(rootNode.rightNode);
            rootNode.data = IS.data;
            rootNode.rightNode = delete(rootNode.rightNode, IS.data);

        }
        return rootNode;
    }

    /**
     * https://www.youtube.com/watch?v=qAeitQWjNNg
     */
    private void printInRange(Node node, int x, int y) {
        if (node == null)
            return;
        if (node.data >= x && node.data <= y) {
            printInRange(node.leftNode, x, y);
            System.out.println(node.data);
            printInRange(node.rightNode, x, y);
        } else if (node.data <= x)
            printInRange(node.leftNode, x, y);
        else printInRange(node.rightNode, x, y);

    }

    private void printRootToLeaf(Node node, ArrayList<Integer> path) {
        if (node == null)
            return;
        path.add(node.data);
        if (node.leftNode == null && node.rightNode == null)
            printPath(path);
        else {
            printRootToLeaf(node.leftNode, path);
            printRootToLeaf(node.rightNode, path);
        }
        path.remove(path.size() - 1);
    }

    private void printPath(ArrayList<Integer> path) {
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }

    private Node inorderSuccessor(Node node) {
        while (node.leftNode != null)
            node = node.leftNode;
        return node;
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

        Node root = null;
        root = bst.insert2(root, 9);
        root = bst.insert2(root, 4);
        root = bst.insert2(root, 6);
        root = bst.insert2(root, 20);
        root = bst.insert2(root, 170);
        root = bst.insert2(root, 15);
        root = bst.insert2(root, 1);
        System.out.println(root);
        System.out.println(bst.search(root, 170));

        bst.inorderTraversal(root);

        //bst.delete(root, 9);
        //bst.inorderTraversal(root);

        bst.printInRange(root, 4, 15);

        bst.printRootToLeaf(root,new ArrayList<Integer>());
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

