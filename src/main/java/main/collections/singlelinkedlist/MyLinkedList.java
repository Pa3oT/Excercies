package main.collections.singlelinkedlist;

 class MyLinkedList {
    private Node headNode;
    private int listCount;

    public MyLinkedList(int i) {
        headNode = new Node(i);
        listCount = 0;
    }


     public void add(Object data) {
        Node newNode = new Node(data);
        Node nodeCurrent = headNode;
        while (nodeCurrent.nextNode != null) {
            nodeCurrent = nodeCurrent.nextNode;
        }
        nodeCurrent.nextNode = newNode;
        listCount++;
    }

    public void add(Object data, int index) {
        Node newNode = new Node(data);
        Node nodeCurrent = headNode;
        for (int i = 1; i < index && nodeCurrent.nextNode != null; i++) {
            nodeCurrent = nodeCurrent.nextNode;
        }
        newNode.setNextNode(nodeCurrent.nextNode);
        nodeCurrent.setNextNode(newNode);
        listCount++;
    }

    public Object get(int index) {
        if (index <= 0)
            return null;
        Node nodeCurrent = headNode;
        for (int i = 1; i < index; i++) {
            if (nodeCurrent.nextNode == null)
                return null;
            nodeCurrent = nodeCurrent.nextNode;
        }
        return nodeCurrent.getData();
    }

    public boolean remove(int index) {
        if (index < 1 || index > size())
            return false;
        Node nodeCurrent = headNode;
        for (int i = 1; i < index; i++) {
            if (nodeCurrent.nextNode == null)
                return false;
            nodeCurrent = nodeCurrent.nextNode;
        }
        nodeCurrent.setNextNode(nodeCurrent.nextNode.nextNode);
        listCount--;
        return true;
    }

    public int size() {
        return listCount;
    }

    public String toString() {
        Node nodeCurrent = headNode;
        String output = "";
        while (nodeCurrent != null) {
            output += "[" + nodeCurrent.getData().toString() + "]";
            nodeCurrent = nodeCurrent.nextNode;
        }
        return output;
    }

    private class Node {
        Node nextNode;
        Object data;

        public Node(Object dataValue) {
            nextNode = null;
            data = dataValue;
        }

        public Node(Object dataValue, Node nextValue) {
            nextNode = nextValue;
            data = dataValue;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object dataValue) {
            data = dataValue;
        }

        public Node nextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextValue) {
            nextNode = nextValue;
        }

        public String toString() {
            return String.valueOf(data);
        }
    }

    public static void main(String[] args) {
        MyLinkedList lList = new MyLinkedList(0);

        lList.add("1");
        lList.add("6", 4);
        lList.add("5");
        lList.add("5");
        lList.add("5");
        lList.add("5");

        System.out.println("lList - print linkedlist: " + lList);
       /* System.out.println(lList.get(1));
        System.out.println("lList.size() - print linkedlist size: " + lList.size());
        System.out.println("lList.get(3) - get 3rd element: " + lList.get(3));
        System.out.println("lList.remove(2) - remove 2nd element: " + lList.remove(2));
        System.out.println("lList.get(3) - get 3rd element: " + lList.get(3));
        System.out.println("lList.size() - print linkedlist size: " + lList.size());
        System.out.println("lList - print linkedlist: " + lList);*/

    }
}
