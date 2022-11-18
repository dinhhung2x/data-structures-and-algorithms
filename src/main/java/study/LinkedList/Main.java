package study.LinkedList;

import study.LinkedList.controller.MyList;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.addFirst(5);
        list.addFirst(7);
        list.traversal();
    }
}