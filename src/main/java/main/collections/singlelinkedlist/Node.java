package main.collections.singlelinkedlist;


public class Node {
    Node nextNode;
    int data;

    public Node(int dataValue) {
        nextNode = null;
        data = dataValue;
    }

    public Node(int dataValue, Node nextValue) {
        nextNode = nextValue;
        data = dataValue;
    }
    public String toString() {
        return String.valueOf(data);
    }
}
