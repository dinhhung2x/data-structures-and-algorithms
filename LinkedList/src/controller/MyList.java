package controller;

import model.Node;

public class MyList {
    Node head, tail;

    public MyList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int index) {
        Node p = new Node(index);
        if(isEmpty()){
            head = tail = p;
        }else{
            p.next= head;
            head = p;
        }
    }
    public void traversal(){
        Node  p = head;
        while(p != null){
          System.out.print(p.info+" ");
          p=p.next;  
        }
    }
}
