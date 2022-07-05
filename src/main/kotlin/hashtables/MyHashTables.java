package hashtables;

import java.util.ArrayList;
import java.util.List;

public class MyHashTables {

    private static class MyNodes extends ArrayList<Node> {
    }

    MyNodes[] data;

    public MyHashTables(int size) {
        data = new MyNodes[size];
    }

    public int generateHashKey(Object key) {
        int hash = 0;
        for (int i = 0; i < key.toString().length(); i++) {
            hash = (hash + (int) key.toString().charAt(i) * i) % this.data.length;
        }
        return hash;
    }

    public void setData(Object key, Object value) {
        if (data[generateHashKey(key)] == null)
            data[generateHashKey(key)] = new MyNodes();
        data[generateHashKey(key)].add(new Node(key, value));
    }

    public Object getData(Object key) {
        if (data[generateHashKey(key)] == null)
            return "Searching for wrong key";
        for (int i = 0; i < data[generateHashKey(key)].size(); i++) {
            Node node = data[generateHashKey(key)].get(i);
            if (node.key == key)
                return node.value;
        }
        return "Searching for wrong key";
    }

    public List<Object> getKeys() {
        ArrayList<Object> keys = new ArrayList<>();
        for (MyNodes datum : data)
            if (datum != null)
                for (Node node : datum) keys.add(node.key);
        return keys;
    }

    public static void main(String[] args) {
        MyHashTables hash = new MyHashTables(2);
        hash.setData("data", 100);
        hash.setData("data1", 'a');
        hash.setData("data2", "string");
        System.out.println("data");
        System.out.println(hash.getData("data1"));
        System.out.println(hash.getData("data2"));
        System.out.println(hash.getKeys());
    }

    class Node {

        private Object key;
        private Object value;

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Object getKey() {
            return key;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }

}
