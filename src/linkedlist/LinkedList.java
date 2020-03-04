package linkedlist;

public class LinkedList {
    Node head;

    public void add(int i) {
        Node node = new Node(i);
        if(head == null)
        {
            head = node;
            return;
        }
        Node cur = head;
        while(cur.getNext()!=null)
        {
            cur = cur.getNext();
        }
        cur.setNext(node);

    }

    public void displayNodes() {
        if(head == null)
            return;
        if(head.getNext() == null)
        {
            System.out.println(head.getValue());
        }
        Node cur = head;
        while(cur.getNext()!=null)
        {
            System.out.println(cur.getValue());
            cur = cur.getNext();
        }
    }
}
