package queue;

import common.Node;

public class Queue {
    Node first;
    public void add(int data)
    {
        Node node = new Node(data);
        if(first ==null)
        {
            first = node;
            return;
        }
        Node cur = first;
        while(cur.getNext()!=null)
        {
            cur = cur.getNext();
        }
        cur.setNext(node);

    }

    public void delete()
    {
        if(first ==null)
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Delete "+first.getValue()+"from list");
        first = first.getNext();
        return;
    }

}

