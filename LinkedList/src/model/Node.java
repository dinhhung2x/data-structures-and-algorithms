package model;

public class Node {
    public int info;
    public Node next;

    public Node(int info, Node next) {
        this.info = info;
        this.next = next;
    }

    public Node(int info) {
        this(info, null);
    }

}
