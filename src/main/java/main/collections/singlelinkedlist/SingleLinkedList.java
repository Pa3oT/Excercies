package main.collections.singlelinkedlist;

import java.util.Arrays;

public class SingleLinkedList {

    public static void main(String[] args) {
        //Node tail = genIter(1, 2, 3, 4, 5);
        Node tail1 = genRec(1, 2, 3, 4, 5);
        System.out.println(toStringIter(tail1));
        System.out.println(toStringRec(tail1));
        System.out.println(toStringIter(invert(tail1)));
        String s = "Hello".intern();
    }

    public static Node genIter(int... value) {
        Node tail = null;
        for (int k = value.length - 1; k >= 0; k--) {
            tail = new Node(value[k], tail);
        }
        return tail;
    }

    public static Node genRec(int... value) {
        if (value.length == 0) {
            return null;
        } else {
            int[] newArray = Arrays.copyOfRange(value, 1, value.length);
            Node node = genRec(newArray);
            return new Node(value[0], node);
        }
    }

    public static String toStringIter(Node tail) {
        String result = "";
        while (tail != null) {
            result = result + tail.data + "->";
            tail = tail.nextNode;
        }
        return result + "*";
    }

    public static String toStringRec(Node tail) {
        return (tail == null) ? "*" : tail.data + "->" + toStringRec(tail.nextNode);
    }

    public static Node merge(Node node1, Node node2) {
        if (node1 != null && node2 != null) {
            if (node1.data < node2.data) {
                return new Node(node1.data, merge(node1.nextNode, node2));
            } else {
                return new Node(node2.data, merge(node1, node2.nextNode));
            }
        } else {
            return (node1 == null) ? node2 : node1;
        }
    }

    public static Node copy(Node node) {
        return node == null ? null : new Node(node.data, copy(node.nextNode));
    }

    public static boolean isEqual(Node n1, Node n2) {
        if(n1 != null && n2 != null) {
            return (n1.data == n2.data) && isEqual(n1, n2);
        } else {
            return n1 == n2;
        }
    }

    public static int length(Node tail) {
        return tail == null ? 0 : 1 + length(tail.nextNode);
    }

    public static int max(Node tail) {
        return tail == null ? 0 : Math.max(tail.data, max(tail.nextNode));
    }

    public static int sum(Node tail) {
        return tail == null ? 0 : tail.data + sum(tail.nextNode);
    }

    public static Node invert(Node node) {
        if(node == null || node.nextNode == null) {
            return node;
        } else {
            Node result = invert(node.nextNode);
            Node ref = result;
            while (ref.nextNode !=  null) {
                ref = ref.nextNode;
            }
            ref.nextNode = new Node(node.data, null);
            return result;
        }
    }

    public void reverseMyLinkedList(Node headNode) {
        Node reversedPart = null;
        Node current = headNode;
        while (current != null) {
            Node next = current.nextNode;
            current.nextNode = reversedPart;
            reversedPart = current;
            current = next;
        }
        headNode = reversedPart;
    }

    public Node middlePosition(Node headNode) {
        Node current = headNode;
        Node middle = headNode;
        while (current != null && current.nextNode != null) {
            current = current.nextNode.nextNode;
            middle = middle.nextNode;
        }
        return middle;
    }

    public boolean ifLoopExists(Node head) {
        Node fastPtr = head;
        Node slowPtr = head;
        while (fastPtr != null && fastPtr.nextNode != null) {
            fastPtr = fastPtr.nextNode.nextNode;
            slowPtr = slowPtr.nextNode;
            if (slowPtr == fastPtr)
                return true;
        }
        return false;
    }

    public void getNthLastElement(Node node, int pos) {
        Node lastNode = node;
        Node nthNode = node;
        for(int i=0; i < pos - 1; i++) {
            lastNode = lastNode.nextNode;
        }
        while(lastNode != null && lastNode.nextNode != null) {
            lastNode = lastNode.nextNode;
            nthNode = nthNode.nextNode;
        }
        System.out.println(pos + "th last element of the list is: " + nthNode.nextNode);
    }

    public static Node append(Node n1, Node n2) {
        return (n1 == null) ? n2 : new Node(n1.data, append(n1.nextNode, n2));
    }
}
