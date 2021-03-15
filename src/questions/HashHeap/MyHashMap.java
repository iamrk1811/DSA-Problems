package questions.HashHeap;

import java.util.LinkedList;

public class MyHashMap<K, V> {
    private class HMNode {
        K key;
        V value;
        HMNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    LinkedList<HMNode>[] list;
    private int size = 0;

    public MyHashMap() {
        this.size = 0;
        init(4);
    }

    public int size() {
        return this.size;
    }
    public void put(K key, V value) {
        int listIndex = hash(key);
        int datIndex = findInLinkedList(listIndex, key);
        if (datIndex == -1) {
            list[listIndex].add(new HMNode(key, value));
        } else {
            HMNode node = list[listIndex].get(datIndex);
            node.value = value;
            list[listIndex].set(datIndex, node);
            size++;
        }
        double lamda = size * 1.0 / list.length;
        if (lamda > 2.0)
            rehash();
    }
    private void rehash() {
        LinkedList<HMNode>[] oldList = list;

        init(list.length * 2);
        size = 0;

        for (LinkedList<HMNode> l : oldList) {
            for (HMNode node : l) {
                put(node.key, node.value);
            }
        }


    }
    public V get(K key) {
        if (this.size == 0) return null;

        int listIndex = hash(key);
        int dataIndex = findInLinkedList(listIndex, key);

        if (dataIndex == -1) return null;
        else {
            return list[listIndex].get(dataIndex).value;
        }
    }
    private int findInLinkedList(int listIndex, K key) {
        int dataIndex = 0;
        for (HMNode node : list[listIndex]) {
            if (node.key.equals(key)) {
                return dataIndex;
            }
            dataIndex++;
        }
        return -1;
    }
    public boolean containsKey(K key) {
        if (size == 0) return false;
        int listIndex = hash(key);
        int dataIndex = findInLinkedList(listIndex, key);
        return dataIndex != -1;
    }
    public V remove(K key) {
        if (size == 0) return null;
        int listIndex = hash(key);
        int dataIndex = findInLinkedList(listIndex, key);
        if (dataIndex == -1) {
            return null;
        } else {
            this.size--;
            HMNode node = list[listIndex].get(dataIndex);
            list[listIndex].remove(dataIndex);
            return node.value;
        }

    }
    private void init(int size) {
        list = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            list[i] = new LinkedList<>();
        }
    }
    private int hash(K key) {
        int hashcode = key.hashCode();
        return Math.abs(hashcode) % list.length;
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (LinkedList<HMNode> l : list) {
            for (HMNode node : l) {
                str.append(node.key).append(" : ").append(node.value).append(", ");
            }
        }
        str.append("\b\b");
        str.append("]");
        return str.toString();
    }
}
