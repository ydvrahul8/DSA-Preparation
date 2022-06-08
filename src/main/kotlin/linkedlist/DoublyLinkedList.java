package linkedlist;

import java.util.ArrayList;

public class DoublyLinkedList {

    private int length = 0;
    private Node head;
    private Node tail;

    public DoublyLinkedList(Object value) {
        head = new Node(value);
        tail = head;
        length++;
    }

    public ArrayList<Object> getList() {
        Node currentNode = head;
        ArrayList<Object> list = new ArrayList<>();
        while (currentNode != null) {
            list.add(currentNode.value);
            currentNode = currentNode.nextNode;

        }
        return list;
    }

    public void append(Object value) {
        Node newNode = new Node(value);
        newNode.setPreviousNode(tail);
        tail.setNextNode(newNode);
        tail = newNode;
        length++;
    }

    public void prepend(Object value) {
        Node node = new Node(value);
        node.setNextNode(head);
        head.setPreviousNode(node);
        head = node;
        length++;
    }

    public void insert(int index, Object value) {
        if (index == 0) {
            prepend(value);
            return;
        }
        if (index == (length - 1)) {
            append(value);
            return;
        }
        if (index >= length) {
            System.out.println("Index out of bound exception");
            return;
        }

        Node node1 = findNode(index);
        Node node2 = node1.getNextNode();
        Node newNode = new Node(value);
        newNode.setNextNode(node2);
        newNode.setPreviousNode(node1);
        node1.setNextNode(newNode);
        node2.setPreviousNode(newNode);
        length++;
    }

    public void reverseList() {
        if (head.nextNode != null) {
            Node first = head;
            tail = head;
            Node second = head.getNextNode();
            while(second != null){
                Node temp = second.nextNode;
                second.nextNode= first;
                first = second;
                second = temp;
            }
            head.nextNode=null;
            head = first;
        }
    }

    public void delete(int index) {
        if (index == 0) {
            head = head.getNextNode();
            head.previousNode = null;
            length--;
            return;
        }

        if (index == length - 1) {
            Node node = findNode(index);
            node.setNextNode(null);
            length--;
            return;
        }

        if (index >= length) {
            System.out.println("Index out of bound exception");
            return;
        }

        Node node1 = findNode(index);
        Node node2 = node1.getNextNode();
        node1.setNextNode(node2.getNextNode());
        length--;
    }

    public Node findNode(int index) {
        Node node = null;

        for (int i = 0; i < index; i++) {
            if (node == null)
                node = head;
            else {
                node = node.nextNode;
            }
        }
        return node;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList(10);
        System.out.println(list.getList());
        list.append("testAppend");
        list.prepend("testPrepend");
        list.insert(0, "insert0");
        list.insert(list.length - 1, "insertn");
        list.insert(3, "insert3");
        System.out.println(list.getList());
        list.reverseList();
        System.out.println(list.getList());

    }

    class Node {
        Node nextNode;
        Node previousNode;
        Object value;

        public Node(Object value) {
            this.nextNode = null;
            this.previousNode = null;
            this.value = value;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public Node getPreviousNode() {
            return previousNode;
        }

        public void setPreviousNode(Node previousNode) {
            this.previousNode = previousNode;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Value is " + value + " next -> " + nextNode + " previous ->" + previousNode + "\n";
        }

    }

}
