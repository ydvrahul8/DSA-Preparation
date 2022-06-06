package linkedlist;

import java.util.ArrayList;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList(Object value) {
        this.head = new Node(value);
        this.tail = head;
        this.length = 1;
    }

    public void append(Object value) {
        Node newNode = new Node(value);
        tail.setNext(newNode);
        tail = newNode;
        length++;
    }

    public void prepend(Object value) {
        Node node = new Node(value);
        node.setNext(head);
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

        Node node1 = null;

        for (int i = 0; i < index; i++) {
            if (node1 == null)
                node1 = head;
            else {
                node1 = node1.next;
            }
        }

        Node node2 = node1.next;

        Node newNode = new Node(value);
        newNode.setNext(node2);
        node1.setNext(newNode);
        length++;
    }

    public ArrayList<Object> getList() {
        Node currentNode = head;
        ArrayList<Object> list = new ArrayList<>();
        while (currentNode != null) {
            list.add(currentNode.value);
            currentNode = currentNode.next;

        }
        return list;
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.append("test");
        linkedList.prepend(100);
        linkedList.prepend("prepend-1");
        linkedList.insert(0, "insert0");
        linkedList.insert(4, "insert4");
        linkedList.insert(2, "insert2");
        System.out.println(linkedList.head);
        System.out.println(linkedList.getList());
        System.out.println("List size is " + linkedList.length);
    }

    class Node {
        private Object value;
        private Node next;

        public Node(Object value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Value is " + value + " next -> " + next + "\n";
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
