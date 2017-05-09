package main.collections;

import com.sun.istack.internal.Nullable;


public class MyTree {
        public static void main(String[] args) {
            Node o = new Node('o');
            Node n = new Node('n');
            Node m = new Node('m');
            Node l = new Node('l');
            Node k = new Node('k');
            Node j = new Node('j');
            Node i = new Node('i');
            Node h = new Node('h');
            Node g = new Node('g');
            Node f = new Node('f');
            Node e = new Node('e');
            Node d = new Node('d');
            Node c = new Node('c');
            Node b = new Node('b');
            Node a = new Node('a');

            o.setParent(n);
            n.setParent(m);
            m.setParent(l);
            l.setParent(a);
            k.setParent(j);
            j.setParent(h);
            i.setParent(h);
            h.setParent(a);
            g.setParent(f);
            f.setParent(b);
            e.setParent(d);
            d.setParent(c);
            c.setParent(b);
            b.setParent(a);

            b.setSibling(h);
            c.setSibling(f);
            h.setSibling(l);
            i.setSibling(j);

            a.setChild(b);
            b.setChild(c);
            c.setChild(d);
            d.setChild(e);
            f.setChild(g);
            h.setChild(i);
            j.setChild(k);
            l.setChild(m);
            m.setChild(n);
            n.setChild(o);

            System.out.println(c + " = " + getNeighbourOnTheRight(c));
            System.out.println(d + " = " + getNeighbourOnTheRight(d));
            System.out.println(f + " = " + getNeighbourOnTheRight(f));
            System.out.println(j + " = " + getNeighbourOnTheRight(j));
            System.out.println(k + " = " + getNeighbourOnTheRight(k));
            System.out.println(e + " = " + getNeighbourOnTheRight(e));

            System.out.println(a + " = " + getNeighbourOnTheRight(a));
            System.out.println(b + " = " + getNeighbourOnTheRight(b));
            System.out.println(l + " = " + getNeighbourOnTheRight(l));
        }

        @Nullable
        public static Node getNeighbourOnTheRight(Node node) {
            //checkNotNull(node);

            if (node.getSibling() != null) {
                return node.getSibling();
            }

            Node current = node;
            Node lastChild = node;
            int level = 0;

            while (true) {
                if (level == 0 && current != node) {
                    return current;
                }
                else if (level > 0) {
                    if (current.getChild() != null && current.getChild() != lastChild) {
                        current = current.getChild();

                        level--;

                        continue;
                    }

                    if (current.getSibling() != null) {
                        current = current.getSibling();

                        continue;
                    }
                }

                current = current.getParent();

                if (current == null) {
                    break;
                }

                lastChild = current.getChild();
                level++;
            }

            return null;
        }

        public static class Node {
            private final char name;

            @Nullable
            private Node parent;

            @Nullable
            private Node sibling;

            @Nullable
            private Node child;

            public Node(char name) {
                this.name = name;
            }

            @Nullable
            public Node getParent() {
                return parent;
            }

            @Nullable
            public Node getSibling() {
                return sibling;
            }

            @Nullable
            public Node getChild() {
                return child;
            }

            public void setParent(@Nullable Node parent) {
                this.parent = parent;
            }

            public void setSibling(@Nullable Node sibling) {
                this.sibling = sibling;
            }

            public void setChild(@Nullable Node child) {
                this.child = child;
            }

            @Override
            public String toString() {
                return String.valueOf(name);
            }
        }
}
