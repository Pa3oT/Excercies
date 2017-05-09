import java.util.HashMap;
import java.util.Map;

public class MapCollections {
    private static Map<Node, String> stringMap = new HashMap<>();
    static Node node = new Node(1);

    private static void init() {

        stringMap.put(node, "value");
        stringMap.put(new Node(2), "value2");
        stringMap.put(new Node(3), "value3");
        stringMap.put(new Node(4), "value4");
        stringMap.put(new Node(5), "value4");
    }

    public static void main(String[] args) {
        init();
            node.setI(10);
        System.out.println(stringMap.get(node));

        for(Map.Entry entry : stringMap.entrySet()) {
            System.out.println(entry);
        }

        for(Node key : stringMap.keySet()) {
            System.out.println(key);
        }

        for(String value : stringMap.values()) {
            System.out.println(value);
        }
    }
}
class Node {
    int i;

    public Node(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Node{" +
                "i=" + i +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        Node node = (Node) o;

        if (i != node.i) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return i;
    }
}