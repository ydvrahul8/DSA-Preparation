package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BuildTreePreorder {


    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1)
                return null;

            Node newNode = new Node(nodes[idx]);
            newNode.leftNode = buildTree(nodes);
            newNode.rightNode = buildTree(nodes);
            return newNode;
        }

        static ArrayList<Integer> list = new ArrayList<Integer>();

        public static void preOrderTraversal(Node node) {

            if (node != null)
                list.add(node.value);
            else
                return;
            preOrderTraversal(node.leftNode);
            preOrderTraversal(node.rightNode);

        }

        public static void inOrderTraversal(Node node) {
            if (node == null)
                return;

            inOrderTraversal(node.leftNode);
            System.out.println(node.value);
            inOrderTraversal(node.rightNode);
        }

        public static void postOrderTraversal(Node node) {
            if (node == null)
                return;

            postOrderTraversal(node.leftNode);
            postOrderTraversal(node.rightNode);
            System.out.println(node.value);
        }

        public static void levelOrderTraversal(Node node) {
            if (node == null)
                return;

            /**
             *https://www.youtube.com/watch?v=-DzowlcaUmE
             */Queue<Node> queue = new LinkedList<>();
            queue.add(node);
            queue.add(null);
            while (!queue.isEmpty()) {
                Node newNode = queue.remove();
                if (newNode == null) {
                    System.out.println();
                    if (queue.isEmpty()) {
                        break;
                    } else
                        queue.add(null);
                } else {
                    System.out.print(newNode.value + " ");
                    if (newNode.leftNode != null)
                        queue.add(newNode.leftNode);
                    if (newNode.rightNode != null)
                        queue.add(newNode.rightNode);
                }

            }
        }

        public static int countNodeOfTree(Node node) {
            if (node == null)
                return 0;

            int leftNode = countNodeOfTree(node.leftNode);
            int rightNode = countNodeOfTree(node.rightNode);

            return leftNode + rightNode + 1;
        }

        public static int sumOfAllNodeOfTree(Node node) {
            if (node == null)
                return 0;

            int leftNode = sumOfAllNodeOfTree(node.leftNode);
            int rightNode = sumOfAllNodeOfTree(node.rightNode);

            return leftNode + rightNode + node.value;
        }

        public static int calculateHeightOfTree(Node node) {
            if (node == null)
                return 0;

            int leftNode = calculateHeightOfTree(node.leftNode);
            int rightNode = calculateHeightOfTree(node.rightNode);

            return Math.max(leftNode, rightNode) + 1;
        }


        /**
         * Time complexity of this function is O(n^2).
         * Because we are calling another recursive function to calculate height of each subtree.
         */

        public static int diameterOfTree(Node node) {
            if (node == null)
                return 0;

            int leftTreeHeight = diameterOfTree(node.leftNode);
            int rightTreeHeight = diameterOfTree(node.rightNode);
            int root = calculateHeightOfTree(node.leftNode) + calculateHeightOfTree(node.rightNode) + 1;

            return Math.max(Math.max(leftTreeHeight, rightTreeHeight), root);
        }

        /**
         * To solve the same problem with O(n) time complexity we will calculate diameter and height on the same step.
         */

        static class TreeInfo {

            int height;
            int diameter;

            public TreeInfo(int height, int diameter) {
                this.height = height;
                this.diameter = diameter;
            }
        }

        public static TreeInfo diameterOfTree2(Node node) {
            if (node == null)
                return new TreeInfo(0, 0);

            TreeInfo left = diameterOfTree2(node.leftNode);
            TreeInfo right = diameterOfTree2(node.rightNode);
            int height = Math.max(left.height, right.height) + 1;

            int diameter1 = left.diameter;
            int diameter2 = right.diameter;
            int diameter3 = left.height + right.height + 1;

            int diameter = Math.max(Math.max(diameter1, diameter2), diameter3);
            return new TreeInfo(height, diameter);
        }

    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree binaryTree = new BinaryTree();
        Node tree = binaryTree.buildTree(nodes);
        System.out.println(tree);
        System.out.println("PreOrderTraversal");
        binaryTree.preOrderTraversal(tree);
        System.out.println(binaryTree.list);
        System.out.println("InOrderTraversal");
        binaryTree.inOrderTraversal(tree);
        System.out.println("PostOrderTraversal");
        binaryTree.postOrderTraversal(tree);
        System.out.println("LevelOrderTraversal");
        binaryTree.levelOrderTraversal(tree);
        System.out.println("Total Number of nodes in tree " + binaryTree.countNodeOfTree(tree));
        System.out.println("Total Sum of all nodes in tree " + binaryTree.sumOfAllNodeOfTree(tree));
        System.out.println("Height of the tree is " + binaryTree.calculateHeightOfTree(tree));
        System.out.println("Diameter of the tree is " + binaryTree.diameterOfTree(tree));
        System.out.println("Diameter2 of the tree is " + binaryTree.diameterOfTree2(tree).diameter);
    }

    static class Node {
        int value;
        Node leftNode;
        Node rightNode;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", leftNode=" + leftNode +
                    ", rightNode=" + rightNode +
                    '}';
        }

        public Node(int value) {
            this.value = value;
            leftNode = null;
            rightNode = null;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
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
    }

}
